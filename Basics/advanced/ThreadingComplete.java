package Basics.advanced;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadingComplete {

    public static void main(String[] args) throws Exception {

        System.out.println("=== Thread using Thread class ===");
        MyThread t1 = new MyThread();
        t1.start();

        t1.join(); // wait for t1 to complete

        System.out.println("\n=== Thread using Runnable ===");
        Thread t2 = new Thread(new MyRunnable());
        t2.start();

        System.out.println("\n=== Thread using Lambda ===");
        Thread t3 = new Thread(() -> {
            System.out.println("Lambda thread running");
        });
        t3.start();

        Thread.sleep(500); // pause main thread

        System.out.println("\n=== Synchronization Example ===");
        Counter counter = new Counter();

        Thread s1 = new Thread(() -> {
            for (int i = 0; i < 5; i++)
                counter.increment();
        });

        Thread s2 = new Thread(() -> {
            for (int i = 0; i < 5; i++)
                counter.increment();
        });

        s1.start();
        s2.start();

        s1.join();
        s2.join();

        System.out.println("Counter value: " + counter.count);

        System.out.println("\n=== Wait & Notify Example ===");
        SharedData data = new SharedData();

        Thread producer = new Thread(() -> {
            data.produce(100);
        });

        Thread consumer = new Thread(() -> {
            data.consume();
        });

        consumer.start();
        Thread.sleep(100); // ensure consumer waits first
        producer.start();

        producer.join();
        consumer.join();

        System.out.println("\n=== ExecutorService Example ===");
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.execute(() -> {
            System.out.println("Task 1 running");
        });

        Callable<Integer> task = () -> 10 + 20;

        Future<Integer> result = executor.submit(task);
        System.out.println("Callable Result: " + result.get());

        executor.shutdown();

        System.out.println("\n=== Atomic Example ===");
        AtomicInteger atomicCount = new AtomicInteger(0);

        atomicCount.incrementAndGet();
        atomicCount.incrementAndGet();

        System.out.println("Atomic count: " + atomicCount.get());
    }
}

// Thread class
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread class running");
    }
}

// Runnable class
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable thread running");
    }
}

// Synchronization example
class Counter {
    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

// Wait & Notify example
class SharedData {
    private int value;
    private boolean hasValue = false;

    public synchronized void produce(int val) {
        while (hasValue) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        value = val;
        hasValue = true;
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized void consume() {
        while (!hasValue) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Consumed: " + value);
        hasValue = false;
        notify();
    }
}