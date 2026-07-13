package BasicMathematics;

public class LCM {
    public static void main(String[] args) {
        int a = 18;
        int b = 12;
        int x=a;
        int y=b;
        while (y != 0) {
            int remainder = x % y;
            x = y;
            y = remainder;
        }
        int gcd = x;
        int lcm = (a * b) / gcd;
        System.out.println();
        System.out.printf("LCM : %d \n",lcm);

    }
}
