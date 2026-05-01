package Basics.advanced;

import java.util.Optional;

/*
 * ===========================
 * GENERICS + OPTIONAL DEMO
 * ===========================
 */
public class GenericsOptional {

    public static void main(String[] args) {

        // ===========================
        // GENERIC CLASS USAGE
        // ===========================

        // Creating generic object with Integer type
        Box<Integer> intBox = new Box<>();

        intBox.setValue(100); // setting value
        System.out.println("Integer Value: " + intBox.getValue());

        // Creating generic object with String type
        Box<String> strBox = new Box<>();

        strBox.setValue("Hello Generics");
        System.out.println("String Value: " + strBox.getValue());

        // ===========================
        // GENERIC METHOD USAGE
        // ===========================

        printValue(10); // Integer
        printValue("Hello"); // String
        printValue(5.5); // Double

        // ===========================
        // OPTIONAL USAGE
        // ===========================

        Optional<String> name = getName(true);

        // check if value is present
        if (name.isPresent()) {
            System.out.println("Name: " + name.get());
        } else {
            System.out.println("Name is empty");
        }

        // using ifPresent (modern way)
        name.ifPresent(value -> System.out.println("Using ifPresent: " + value));

        // using orElse (default value)
        String defaultName = name.orElse("Default User");
        System.out.println("Name or default: " + defaultName);

        // using orElseGet (lazy evaluation)
        String name2 = name.orElseGet(() -> "Generated Name");
        System.out.println("Name using orElseGet: " + name2);
    }

    // ===========================
    // GENERIC METHOD
    // ===========================
    public static <T> void printValue(T value) {
        System.out.println("Generic Value: " + value);
    }

    // ===========================
    // OPTIONAL METHOD
    // ===========================
    public static Optional<String> getName(boolean hasName) {

        if (hasName) {
            return Optional.of("Hari"); // returning value
        } else {
            return Optional.empty(); // returning empty
        }
    }
}

/*
 * ===========================
 * GENERIC CLASS
 * ===========================
 */
class Box<T> {

    // T → Generic type (can be Integer, String, etc.)
    private T value;

    // setter method
    public void setValue(T value) {
        this.value = value;
    }

    // getter method
    public T getValue() {
        return value;
    }
}