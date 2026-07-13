package BasicMathematics;

public class GCD {
    public static void main(String[] args) {

        // Two numbers whose GCD needs to be found
        int a = 12;
        int b = 18;

        // Repeat until the second number becomes 0
        while (b != 0) {

            // Find the remainder when a is divided by b
            int remainder = a % b;

            // Make b the new value of a
            a = b;

            // Make remainder the new value of b
            b = remainder;

            // Print the remainder at each iteration (for understanding)
            System.out.println("Remainder = " + remainder);
        }

        // When b becomes 0, a contains the GCD
        System.out.println("GCD = " + a);
    }
}