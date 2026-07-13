package BasicMathematics;

public class PowerCalculation {
    public static void main(String[] args) {

        // Base number
        int base = 3;

        // Exponent (number of times the base is multiplied)
        int exponent = 2;

        // Initialize result to 1 (identity value for multiplication)
        int result = 1;

        // Loop runs 'exponent' times
        // Time Complexity: O(exponent)
        for (int i = 1; i <= exponent; i++) {

            // Multiply result by the base in each iteration
            result = result * base;
        }

        // Print the result calculated using the loop
        System.out.println("Power using loop: " + result);

        // Calculate power using Java's built-in Math.pow() method
        // Math.pow() returns a double, so cast it to int
        int res = (int) Math.pow(base, exponent);

        // Print the result calculated using Math.pow()
        System.out.println("Power using Math.pow(): " + res);

        /*
         * Time Complexity:
         * ----------------
         * 1. Loop Approach : O(exponent)
         * - The loop executes 'exponent' times.
         *
         * 2. Math.pow() Approach:
         * - Internally optimized by Java.
         * - Generally considered O(log exponent).
         *
         * Space Complexity:
         * -----------------
         * O(1)
         * - Only a few integer variables are used.
         * - No extra arrays, lists, or recursion.
         */
    }
}