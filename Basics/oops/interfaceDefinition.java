package Basics.oops;

// Main class
public class interfaceDefinition {
    public static void main(String[] args) {

        // Printing a simple value
        System.out.println("1");

        // Creating object of Dog class
        Dog d = new Dog();

        // Calling the method implemented from interface
        d.sound();
    }
}

// Interface (contract)
interface Animal {
    void sound(); // abstract method (no body)
}

// Class implementing the interface
class Dog implements Animal {

    // Providing implementation for the interface method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}