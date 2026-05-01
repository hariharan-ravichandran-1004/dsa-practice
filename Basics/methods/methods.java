package Basics.methods;

// Class name should start with uppercase (best practice)
public class methods {

    // -------------------------------
    // 1. Method without return type (void)
    // -------------------------------
    void sum() {
        // This method just prints the result, does not return anything
        System.out.println(1 + 2);
    }

    // -------------------------------
    // 2. Method with return type (no arguments)
    // -------------------------------
    int mul() {
        // This method returns the multiplication result
        return 2 * 5;
    }

    // -------------------------------
    // 3. Method without return type but with arguments
    // -------------------------------
    void sub(int a, int b) {
        // Takes input values and prints the subtraction result
        System.out.println(a - b);
    }

    // -------------------------------
    // 4. Method with return type and arguments
    // -------------------------------
    double div(int a, int b) {
        // Division of two integers
        // NOTE: This performs integer division first, then converts to double
        return (double) a / b; // Fixed to get correct decimal value
    }

    // -------------------------------
    // 5. Method Overloading
    // -------------------------------
    // Same method name "sum" but different parameters
    int sum(int a, int b, int c) {
        // Adds three numbers and returns result
        return a + b + c;
    }

    // -------------------------------
    // 6. Recursion (Function calling itself)
    // -------------------------------
    int fact(int n) {
        // Base condition (stopping condition)
        if (n == 0)
            return 1;

        // Recursive call
        return n * fact(n - 1);
    }

    // -------------------------------
    // Main Method (Program execution starts here)
    // -------------------------------
    public static void main(String[] args) {

        // Creating object of the class
        methods m = new methods();

        // Calling method overloading example
        int tot = m.sum(5, 5, 5);
        System.out.println("Total: " + tot);

        // Calling recursion method (factorial)
        int f = m.fact(5);
        System.out.println("Factorial: " + f);

        // Calling division method
        double a = m.div(5, 2);
        System.out.println("Division: " + a);
    }
}