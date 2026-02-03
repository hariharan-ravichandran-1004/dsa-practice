package Sorting;
// Time - o(n2) || Space - o(1)
public class BubbleSorting {
    public static void main(String args[]) {
        int[] order = { 1, 4, 2, 5 };
        System.out.println();
        for (int i = 1; i < order.length; i++) {
            for (int j = 1; j < order.length; j++) {
                if (order[j] > order[j + 1]) {
                    int temp = order[j];
                    order[j] = order[j + 1];
                    order[j + 1] = temp;
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < order.length; i++) {
            System.out.print(order[i]);
        }
    }
}

