package BasicMathematics;

public class PalindromeNumber {
    public static void main(String args[]) {
        int n = 12321;
        int originalNumber = n;
        int reversedNumber = 0;

        while (n != 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n /= 10;
        }

        if (originalNumber == reversedNumber){
            System.out.printf("%d is a palindrome number",originalNumber);
        } else {
            System.out.printf("%d is not a palindrome number", originalNumber);
        }
    }
}
