package BasicMathematics;

public class AmstrongNumber {
    public static void main(String[] args) {
        System.out.println();
        int num = 153;
        int temp = num;
        int count = 0;

        while (temp > 0) {
            temp /= 10;
            count++;

        }

        int sum = 0;
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (int) Math.pow(digit, count);
            temp /= 10;
        }
        if (num == sum) {
            System.out.println("It is a amstrong number.");
        } else {
            System.out.println("It is not a amstrong number.");
        }
    }
}
