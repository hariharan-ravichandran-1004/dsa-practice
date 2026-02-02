package PatternLooping;

class SquareHallow {
    public static void main(String[] args) {
        int n = 5;
        System.out.println();
        System.out.println("Square Hellow Pattern  :");
        System.out.println();

        // for row
        for (int i = 1; i <= n; i++) {
            // for column
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    // for printing stars
                    System.out.print("* ");
                } else {
                    // for spacing
                    System.out.print("  ");
                }
            }
            // for new line after every row are done.
            System.out.println();
        }
    }
}