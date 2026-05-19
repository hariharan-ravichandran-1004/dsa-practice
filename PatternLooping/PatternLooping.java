package PatternLooping;

class PatternLooping {
    public static void main(String[] args) {
        int n = 5;
        System.out.println();
        System.out.println("Pattern Looping");
        System.out.println("------------------");
        printTitle("Square Pattern");
        squarePattern(n);
        printTitle("Hallow Pattern");
        hallowPattern(n);
        printTitle("Left Triangle Pattern");
        leftTrianglePattern(n);
        printTitle("Inverted Left Triangle Pattern");
        invertedLeftTrianglePattern(n);
        printTitle("Right Triangle Pattern");
        rightTrianglePattern(n);
        printTitle("Inverted Right Triangle Pattern");
        invertedRightTrianglePattern(n);
        printTitle("Pyramid Pattern");
        pyramidPattern(n);
        printTitle("Inverted Pyramid Pattern");
        invertedPyramidPattern(n);
        printTitle("Diamond");
        diamondPattern(n);
        printTitle("Hallow Triangle");
        hallowTrianglePattern(n);
    }

    public static void printTitle(String title) {
        System.out.println();
        System.out.printf("%s :",title);
        System.out.println();
        System.out.println();

    }

    public static void endColumn() {
        System.out.println();
        System.out.println();
    }

    public static void squarePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*   ");
            }
            endColumn();
        }
    }

    public static void hallowPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*   ");
                } else {
                    System.out.print("    ");
                }
            }
            endColumn();
        }
    }

    public static void leftTrianglePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*   ");
            }
            endColumn();
        }
    }

    public static void invertedLeftTrianglePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print("*   ");
            }
            endColumn();
        }
    }

    public static void rightTrianglePattern(int n) {
        for (int i = 0; i < n; i++) {
            // for spaces
            for (int s = 0; s < n - i; s++) {
                System.out.print("    ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*   ");
            }
            endColumn();
        }
    }

    public static void invertedRightTrianglePattern(int n) {
        for (int i = 0; i < n; i++) {
            // for spaces
            // condition of first iteration is 0 < 0. So, The first iteration is skipped.
            for (int s = 0; s < i; s++) {
                System.out.print("    ");
            }
            // condition of first iteration is 0 < 5 - 0. So, It is print the 5 stars in first row.
            for (int j = 0; j < n - i; j++) {
                System.out.print("*   ");
            }
            endColumn();
        }
    }
    
    public static void pyramidPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print("    ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*   ");
            }
            endColumn();
        }
    }

    public static void invertedPyramidPattern(int n) {
        for (int i = n; i > 0; i--) {
            for (int s = 0; s < n - i; s++) {
                System.out.print("    ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*   ");
            }
            endColumn();
        }
    }

    public static void diamondPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print("    ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*   ");
            }
            endColumn();
        }
        for (int i = n; i > 0; i--) {
            for (int s = 0; s < n - i; s++) {
                System.out.print("    ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*   ");
            }
            endColumn();
        }
    }

    public static void hallowTrianglePattern(int n) {
        for(int i=0;i<n;i++){
            for (int j = 0; j < i+1; j++) {
                // if (j == n) {
                //     System.out.print("*   ");
                // }
                if (i == j || j==0 || i==n-1) {
                    System.out.print("*   ");
                } else {
                    System.out.print("    ");
                }
                
            }
            endColumn();
        }
    }
    

}