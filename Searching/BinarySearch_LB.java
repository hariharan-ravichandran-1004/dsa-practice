package Searching;

public class BinarySearch_LB {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 3, 4, 5 };
        int target = 3;
        int lb = 0;
        int ub = arr.length;
        int result = lowerBound(lb, ub, arr, target);
        System.out.println(result);

    }

    public static int lowerBound(int lb, int ub, int[] arr, int target) {
        while (lb < ub) {
            int mid = lb + (ub - lb) / 2;
            if (arr[mid] >= target) {
                ub = mid;
            } else {
                lb = mid + 1;
            }
        }
        return lb;
    }
}
