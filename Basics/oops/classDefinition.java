package Basics.oops;

// This class represents a project setup with basic details
class ProjectSetup {

    // Variable to store project name
    String projectName;

    // Variable to store project lead name
    String projectLead;

    // Variable to store number of resources in the project
    int resourcesCount;

    // Method to print the project lead
    void printLead() {
        // Prints an empty line for spacing
        System.out.println();

        // Prints the project lead name
        System.out.println("This project is lead by " + projectLead);
    }
}

// Main class where the program starts execution
public class classDefinition {
    public static void main(String[] args) {

        // Creating an object of ProjectSetup class
        ProjectSetup ps = new ProjectSetup();

        // Assigning values to object variables
        ps.projectName = "Test";
        ps.projectLead = "Travis";
        ps.resourcesCount = 6;

        // Calling method to print project lead
        ps.printLead();
    }
}