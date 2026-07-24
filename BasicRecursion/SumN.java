package BasicRecursion;

public class SumN {
    public static void main(String[] args) {
        int n = 5;
        int result = sumN(n);
        System.out.println(result);
    }

    static int sumN(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumN(n - 1);
    }
}
