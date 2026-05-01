package Basics;

public class Operators {

    public static void main(String arg[]) {
        int a = 2;
        int b = 1;
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        double div = a / b;
        double mod = a % b;
        System.out.printf("Sum of a and b is : %d\n", sum);
        System.out.printf("sub of a and b is : %d\n", sub);
        System.out.printf("mul of a and b is : %d\n", mul);
        System.out.printf("div of a and b is : %.2f\n", div);
        System.out.printf("mod of a and b is : %.3f\n", mod);
        System.out.printf("|%10s|", "Hari");
        System.out.println();
        System.out.printf("Hello%nWorld\n");

        // Format Specifiers
        // %d → integers
        // %f → floating numbers (double also)
        // %s → strings
        // %.2f → precision control
        // %-10s → alignment
        // %n → portable new line

    }
}
