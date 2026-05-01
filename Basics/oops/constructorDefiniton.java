package Basics.oops;

// Main class where execution starts
public class constructorDefiniton {
    public static void main(String[] args) {

        // Creating object of ProjectDetails class
        // This will call the default constructor
        ProjectDetails pd = new ProjectDetails();

        // Creating object of ResourcesInformation class
        // This will call the parameterized constructor
        ResourcesInformation ri = new ResourcesInformation("Travis", 25);

        // Printing empty line for spacing
        System.out.println();

        // Printing resource details
        System.out.println("Name of the resource : " + ri.name);
        System.out.println("Age of the resource : " + ri.age);

    }
}

// Default constructor example
class ProjectDetails {

    // Default constructor (no parameters)
    ProjectDetails() {
        System.out.println();
        System.out.println("This is a default constructor");
    }
}

// Parameterized Constructor example
class ResourcesInformation {

    // Variables to store resource details
    String name;
    int age;

    // Parameterized constructor (accepts values during object creation)
    ResourcesInformation(String name, int age) {

        // 'this' keyword refers to current object
        this.name = name;
        this.age = age;
    }
}