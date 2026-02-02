package ArraysStrings;

public class LinearSearch {
    public static void main(String args[]) {
        System.out.println();
        System.out.println("Linear Search : ");
        System.out.println();

        int[] num = { 10, 20, 30, 40, 50 };
        int target = 20;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
            System.out.printf("Found : %d at %d%n",num[i],i);
           }
        }
        
    }
}
