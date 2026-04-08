package Basics.oops;

/**
 * This class demonstrates Encapsulation in Java.
 * Encapsulation means hiding data (variables) and
 * providing controlled access using getters and setters.
 */
public class encapsulationDef { // ✅ Class name should start with uppercase

    public static void main(String[] args) {

        // Creating an object of Person class
        Person p = new Person();

        // Setting value using setter method
        p.setName("Travis");

        // Getting value using getter method
        String name = p.getName();

        // Printing output
        System.out.println("Person Name: " + name);
    }
}

/**
 * Person class with private variable
 * and public getter & setter methods
 */
class Person {

    // Private variable (data hiding)
    private String name;

    /**
     * Getter method to access the name
     * 
     * @return name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method to update the name
     * 
     * @param name - new name to be set
     */
    public void setName(String name) {

        // ✅ Basic validation (improvement)
        if (name == null || name.isEmpty()) {
            System.out.println("Name cannot be empty!");
            return;
        }

        this.name = name;
    }
}