package Basics.advanced;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsDef {
    public static void main(String[] args) {

        System.out.println("=== LIST EXAMPLES ===");
        ListDefinition ld = new ListDefinition();
        ld.arrayPrint();
        ld.linkedPrint();

        System.out.println("\n=== SET EXAMPLES ===");
        SetDefinition sd = new SetDefinition();
        sd.hashSetPrint();
        sd.treeSetPrint();

        System.out.println("\n=== MAP EXAMPLES ===");
        MapDefinition md = new MapDefinition();
        md.hashMapPrint();
        md.treeMapPrint();

        System.out.println("\n=== QUEUE EXAMPLES ===");
        QueueDefinition qd = new QueueDefinition();
        qd.queuePrint();
        qd.priorityQueuePrint();
    }
}

// ---------------- LIST ----------------
class ListDefinition {

    // ArrayList preserves insertion order and allows duplicates
    void arrayPrint() {
        ArrayList<Integer> numArrayList = new ArrayList<>();
        numArrayList.add(1);
        numArrayList.add(2);
        numArrayList.add(3);

        System.out.println("ArrayList Output: " + numArrayList);
    }

    // LinkedList maintains insertion order, implemented using nodes
    void linkedPrint() {
        LinkedList<Integer> numLinkedList = new LinkedList<>();
        numLinkedList.add(1);
        numLinkedList.add(1);
        numLinkedList.add(3);

        System.out.println("LinkedList Output: " + numLinkedList);
    }
}

// ---------------- SET ----------------
class SetDefinition {

    // HashSet does not maintain order and does not allow duplicates
    void hashSetPrint() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(3);

        System.out.println("HashSet Output: " + hashSet);
    }

    // TreeSet sorts elements in ascending order
    void treeSetPrint() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(3);

        System.out.println("TreeSet Output: " + treeSet);
    }
}

// ---------------- MAP ----------------
class MapDefinition {

    // HashMap does not maintain order
    void hashMapPrint() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);

        System.out.println("HashMap Output: " + hashMap);
    }

    // TreeMap sorts keys in ascending order
    void treeMapPrint() {
        TreeMap<String, Object> treeMap = new TreeMap<>();
        treeMap.put("a", 1);
        treeMap.put("b", 2);

        System.out.println("TreeMap Output: " + treeMap);
    }
}

// ---------------- QUEUE ----------------
class QueueDefinition {

    // Queue follows FIFO (First In First Out)
    void queuePrint() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(5);

        System.out.println("Queue before poll: " + queue);

        queue.add(4); // Add element at the end
        queue.poll(); // Removes the first element

        System.out.println("Queue after poll: " + queue);
    }

    // PriorityQueue sorts elements based on priority (natural ordering)
    void priorityQueuePrint() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(5);

        System.out.println("PriorityQueue before poll: " + priorityQueue);

        priorityQueue.add(4); // Adds element
        priorityQueue.poll(); // Removes highest priority (smallest number)

        System.out.println("PriorityQueue after poll: " + priorityQueue);
    }
}