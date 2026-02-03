package Basics.Arrays;

class TwoDArray {
    public static void main(String args[]) {
        int[][] marks = {
                { 100, 70, 23, 40, 17 },
                { 20, 48, 59, 85, 69 }
        };
        System.out.println();
        System.out.printf("English mark of the student 1 : %d%n", marks[0][0]);
        System.out.printf("English mark of the student 2 : %d%n", marks[1][0]);

    }
}