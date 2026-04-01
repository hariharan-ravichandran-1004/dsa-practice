package Basics.oops;

// Main class
public class inheritanceDef {

    public static void main(String[] args) {

        // Creating Dog object
        Dog d = new Dog();

        // Calling Dog's own method
        d.bark();

        // Creating Crow object
        Crow c = new Crow();

        // Calling overridden method from Crow class
        c.sound();
    }
}

// Parent class (Super class)
class Animal {

    // Method that can be inherited by child classes
    void sound() {
        System.out.println("Animal makes sound");
    }
}

// Child class (inherits from Animal)
class Dog extends Animal {

    // Dog's own method (not overriding)
    void bark() {
        System.out.println("Dog barks");
    }
}

// Another child class (inherits from Animal)
class Crow extends Animal {

    // Overriding parent class method
    @Override
    void sound() {

        // This replaces Animal's sound() method
        System.out.println("Crow caws");
    }
}