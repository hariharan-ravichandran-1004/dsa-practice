package Basics.oops;

// Main class
public class accessModifierDef {

    public static void main(String[] args) {

        // Creating object with parameterized constructor
        EmployeeInformation ei = new EmployeeInformation("Travis", 25);

        System.out.println();

        // Accessing public variable (allowed anywhere)
        System.out.println("Employee name : " + ei.name);

        // Modifying public variable (allowed)
        ei.name = "Trevor";
        System.out.println("Employee name : " + ei.name);

        System.out.println();

        // ❌ Cannot access private variable directly outside the class
        // System.out.println("Employee Age : " + ei.age);

        // ✅ Accessing private variable using public method (getter)
        System.out.println("Employee Age : " + ei.getAge());

        // ✅ Accessing protected variable (same package allowed)
        System.out.println("Employee Department : " + ei.department);
    }
}

// Class to demonstrate access modifiers
class EmployeeInformation {

    // PUBLIC → accessible everywhere
    public String name;

    // PRIVATE → accessible only within this class
    private int age;

    // PROTECTED → accessible within same package + subclasses
    protected String department;

    // Constructor
    EmployeeInformation(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "Development"; // default value
    }

    // Public method to access private variable (Getter)
    public int getAge() {
        return age;
    }
}