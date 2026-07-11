package BasicMathematics;

public class ReverseNumber {

    public static void main(String[] args) {

        // Original number that we want to reverse
        int n = 12345;

        // Variable to store the reversed number
        // Initially there are no digits, so value is 0
        int reversed = 0;

        // Continue the loop until all digits are removed from n
        while (n != 0) {

            // Get the last digit of n
            // Example: 12345 % 10 = 5
            int digit = n % 10;

            // Add the extracted digit to the reversed number
            // Multiply reversed by 10 to shift existing digits left
            //
            // Example:
            // reversed = 0
            // reversed * 10 + 5 = 5
            //
            // Next:
            // reversed = 5
            // reversed * 10 + 4 = 54
            reversed = reversed * 10 + digit;

            // Remove the last digit from n
            // Example:
            // 12345 / 10 = 1234
            n /= 10;
        }

        // Print the final reversed number
        System.out.println("Reversed number: " + reversed);
    }
}