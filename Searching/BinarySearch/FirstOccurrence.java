package Searching.BinarySearch;

public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 4, 5 };
        int target = 6;
        int low = 0;
        int high = arr.length;
        int result = firstOccurrence(arr,target,low,high);
        System.out.println(result);
    }

     static int firstOccurrence(int[] arr, int target, int low, int high) {
         while (low < high) {
             int mid = low + (high - low) / 2;
             if (arr[mid] >= target) {
                 high = mid;
             } else {
                 low = mid + 1;
             }
         }
         if (low < arr.length && arr[low] == target) {
             return low;
         }
         return -1;

    }
}
