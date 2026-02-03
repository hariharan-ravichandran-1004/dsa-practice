package Sorting;

public class SelectionSorting {
    public static void main(String args[]) {
        int[] a = { 2, 6, 9, 1, 0 };
        int n=a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;

        }
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
