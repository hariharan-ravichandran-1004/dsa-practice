package BasicRecursion;

public class Recursion {

    public static void main(String[] args) {

        // Create a variable 'n' and assign the value 5
        int n = 5;

        // Call the recursive method with n = 5
        printInfinite(n);
    }

    // Recursive method to print numbers from n down to 1
    static void printInfinite(int n) {

        // Base case:
        // Stop the recursion when n becomes 0
        if (n == 0) {
            return;
        }

        // Print the current value of n
        System.out.println(n);

        // Recursive case:
        // Call the same method with n - 1
        printInfinite(n - 1);
    }
}