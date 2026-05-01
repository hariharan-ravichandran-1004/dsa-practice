package Basics.oops;

// Main class
public class finalStaticDef {

    public static void main(String[] args) {

        // FINAL → value cannot be changed after assignment
        final int x = 10;

        // x = 20; ❌ Not allowed (will give error)

        // STATIC variable example
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        // Both objects share same static variable
        System.out.println("Count: " + Counter.count);

        // Calling static method using class name
        Utils.display();
    }
}

// Class to demonstrate static variable
class Counter {

    // STATIC → shared across all objects
    static int count = 0;

    // Constructor
    Counter() {
        count++; // Increases every time object is created
    }
}

// Class with static method
class Utils {

    // STATIC method → can be called without creating object
    static void display() {
        System.out.println("Static method");
    }
}

// Class demonstrating FINAL method
class Parent {

    // FINAL method → cannot be overridden in child class
    final void show() {
        System.out.println("Final method in Parent");
    }
}

// FINAL class → cannot be extended (no inheritance allowed)
final class FinalClass {

    void demo() {
        System.out.println("Inside final class");
    }
}