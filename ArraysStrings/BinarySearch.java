package ArraysStrings;

public class BinarySearch {
    public static void main(String args[]) {
        System.out.println();
        System.out.println("Binary Search : ");
        System.out.println();

        int[] num = { 10, 20, 30, 40, 50, 80, 100, 102, 150 };
        int target = 102;
        int low = 0;
        int high = num.length - 1;
        int i = 0;
        // Flag to check whether the element was found in the array or not.
        boolean isFound = false;
        while (low <= high) {
            System.out.printf("Step %d%n", i++);
            // Find the mid value
            int mid = (low + high) / 2;
            // System.err.printf("Mid : %d%n", mid);
            // Check whether the mid value is equal to the target value.
            if (num[mid] == target) {
                System.out.printf("Found : Element %d at index of %d%n", target, mid);
                isFound = true;
                break;
            } else if (target < num[mid]) {
                // If the target value is less than mid value, decrease the high value

                high = mid - 1;
            } else {
                // If the target value is greater than mid value, increase the low value

                low = mid + 1;
            }
        }
        if (!isFound) {
            // If the target value was not found, print this statement.
            System.err.printf("Element %d was not found in this array", target);
        }

    }
}
