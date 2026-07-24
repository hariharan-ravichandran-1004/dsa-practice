package BasicRecursion;

public class Factorial {

    public static void main(String[] args) {

        // Initialize the number whose factorial we want to calculate
        int n = 5;

        // Call the factorial method and store the returned result
        int result = factorial(n);

        // Print the final factorial result
        System.out.printf("Result: %d\n", result);
    }

    // Recursive method to calculate the factorial of n
    static int factorial(int n) {

        // Base case:
        // When n becomes 0, stop the recursion
        // 0! = 1
        if (n == 0) {
            return 1;
        }

        // Recursive case:
        // Multiply n by the factorial of n - 1
        return n * factorial(n - 1);
    }
}