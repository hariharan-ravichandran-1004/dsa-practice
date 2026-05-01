package Basics;

public class Variables {
    public static void main(String[] args) {
        // Access the static variable directly using the class name
        System.out.println(Constants.name);

        // Create an instance of the Constants class to access instance members
        Constants c = new Constants();

        // Access the instance variable through the object
        System.out.println(c.age);

        // Call the instance method using the object
        c.dob();
    }
}

class Constants {
    // Static variable belongs to the class and can be accessed without creating an object
    static String name = "Hariharan";

    // Instance variable belongs to an object and requires an object to access
    int age = 25;

    // Instance method
    void dob() {
        // Local variable exists only inside this method
        String dob = "10 Apr 2000";

        // Access and print the local variable
        System.out.println(dob);
    }
}