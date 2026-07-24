package BasicRecursion;

import java.util.Arrays;

public class ReverseArr {

    public static void main(String[] args) {

        // Create an integer array
        int[] array = { 0, 1, 2, 3 };

        // Call the recursive method to reverse the array
        reverse(array, 0, array.length - 1);

        // Print the reversed array
        System.out.println(Arrays.toString(array));
    }

    // Recursive method to reverse the array
    static void reverse(int[] array, int start, int end) {

        // Base case:
        // Stop recursion when start and end meet or cross
        if (start >= end) {
            return;
        }

        // Store the element at the start index temporarily
        int temp = array[start];

        // Replace the start element with the end element
        array[start] = array[end];

        // Replace the end element with the original start element
        array[end] = temp;

        // Recursive call:
        // Move start forward and end backward
        reverse(array, start + 1, end - 1);
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n) - Due to recursive call stack