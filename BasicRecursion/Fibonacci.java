package BasicRecursion;

public class Fibonacci {

    public static void main(String[] args) {

        // Define the position of the Fibonacci number to calculate
        int n = 5;

        // Call the recursive Fibonacci method and store the result
        int result = fibonacci(n);

        // Print the final result
        System.out.printf("Result: %d\n", result);
    }

    // Recursive method to calculate the Fibonacci number at position n
    static int fibonacci(int n) {

        // Base case:
        // If n is 0 or 1, return n directly
        // Fibonacci(0) = 0
        // Fibonacci(1) = 1
        if (n == 0 || n == 1) {
            return n;
        }

        // Recursive case:
        // Calculate the current Fibonacci number
        // by adding the previous two Fibonacci numbers
        // Fibonacci(n) = Fibonacci(n - 1) + Fibonacci(n - 2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}