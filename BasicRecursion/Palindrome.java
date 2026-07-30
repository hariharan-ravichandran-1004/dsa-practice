package BasicRecursion;

public class Palindrome {
    public static void main(String[] args) {

        // Input string to check
        String value = "level";

        // Call the recursive palindrome function
        boolean res = isPalindrome(value, 0, value.length() - 1);

        // Print the result
        System.out.println(res);
    }

    /**
     * Checks whether a string is a palindrome using recursion.
     *
     * @param value The input string.
     * @param left  Starting index.
     * @param right Ending index.
     * @return true if the string is a palindrome, otherwise false.
     */
    static boolean isPalindrome(String value, int left, int right) {

        // Base Case:
        // If the left index crosses or meets the right index,
        // all character pairs have matched.
        if (left >= right) {
            return true;
        }

        // If the characters at the current indices are different,
        // the string is not a palindrome.
        if (value.charAt(left) != value.charAt(right)) {
            return false;
        }

        // Recursive Case:
        // Move the left pointer one step forward
        // and the right pointer one step backward.
        return isPalindrome(value, left + 1, right - 1);
    }
}

/*
 * -----------------------------------------
 * Dry Run
 * -----------------------------------------
 * 
 * Input:
 * value = "level"
 * 
 * Initial Call:
 * isPalindrome("level", 0, 4)
 * 
 * Step 1:
 * left = 0, right = 4
 * value.charAt(0) = 'l'
 * value.charAt(4) = 'l'
 * Characters match.
 * Call isPalindrome("level", 1, 3)
 * 
 * Step 2:
 * left = 1, right = 3
 * value.charAt(1) = 'e'
 * value.charAt(3) = 'e'
 * Characters match.
 * Call isPalindrome("level", 2, 2)
 * 
 * Step 3:
 * left = 2, right = 2
 * left >= right
 * Return true
 * 
 * Return Flow:
 * true -> true -> true
 * 
 * Output:
 * true
 * 
 * -----------------------------------------
 * Time Complexity:
 * O(n)
 * - Each character pair is checked only once.
 * 
 * Space Complexity:
 * O(n)
 * - Due to the recursive call stack.
 * -----------------------------------------
 */