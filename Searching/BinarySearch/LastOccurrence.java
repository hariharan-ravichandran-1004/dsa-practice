package Searching.BinarySearch;

public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 4, 5 };
        int target = 4;
        int result = lastOccurrence(arr, target);
        System.out.println(result);
    }

    public static int lastOccurrence(int[] arr, int target) {
        int index = upperBound(arr, target)-1;
        if (index >= 0 && arr[index] == target) {
            return index;
        }
        return -1;
    }

    public static int upperBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
