package Searching.BinarySearch;

public class UpperBound {
    public static void main(String[] args) {
        int target = 4;
        int[] arr = { 1, 2, 3, 4, 4, 4, 5, 6 };
        int low=0;
        int high=arr.length;
        int result = upperbound(low,high,arr,target);
        System.out.println(result);
    }

    public static int upperbound(int low, int high, int[] arr, int target) {
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]>target){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}
