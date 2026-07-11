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
        printTitle("Floyd's Triangle");
        floydsTrianglePattern(n);
        printTitle("Number Increasing Triangle (Row wise");
        numberIncreasingTriangle(n);
        printTitle("Number Decreasing Triangle (Row wise)");
        numberDecreasingTriangle(n);
        printTitle("Pyramid Palindrome");
        pyramidPalindromPattern(n);
        printTitle("Butterfly");
        butterflyPattern(n);
        printTitle("Triangle");
        triangle(n);
        printTitle("Inverted Triangle");
        invertedTriangle(n);
        printTitle("Hallow Pyramid");
        hallowPyramid(n);
        printTitle("Increasing Number Triangle (Continuous)");
        increasingNumberTriangle(n);
        printTitle("Decreasing Number Triangle (Continuous)");
        decreasingNumberTriangle(n);
        printTitle("Pascal's Triangle");
        pascalTriangle(n);
        printTitle("Alphabet Pattern");
        alphabetPattern(n);
        printTitle("Reverse Alphabet Pattern");
        reverseAlphabetPattern(n);
        printTitle("End of Pattern Looping");
    }

    public static void printTitle(String title) {
        System.out.println();
        if(title.equals("End of Pattern Looping")){
            System.out.printf("-------- %s --------",title);
        } else {
            System.out.printf("%s :",title);
        }
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
            for (int j = 0; j < i; j++) {
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
    
    public static void floydsTrianglePattern(int n) {
        int number = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                number++;
                System.out.printf("%d   ", number);
            }
            endColumn();
        }
    }
    
    public static void numberIncreasingTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.printf("%d   ", j + 1);
            }
            endColumn();
        }
    }
    
    public static void numberDecreasingTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.printf("%d   ", n - j + 1);
            }
            endColumn();
        }
    }
    
    public static void pyramidPalindromPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print("    ");
            }
            for (int j = 0; j < i; j++) {
                System.out.printf("%d   ", j + 1);
            }
            for (int j = i - 1; j > 0; j--) {
                System.out.printf("%d   ", j);
            }
            endColumn();
        }
    }
    
    public static void butterflyPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*   ");
            }
            for (int k = 0; k < 2 * (n - i); k++) {
                System.out.print("    ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*   ");
            }
            endColumn();
        }

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*   ");
            }
            for (int k = 0; k < 2 * (n - i); k++) {
                System.out.print("    ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*   ");
            }
            endColumn();
        }
    }
    
    public static void triangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print("-   ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*   ");
            }
            endColumn();
        }
    }
    
    public static void invertedTriangle(int n) {
        for (int i = n; i > 0; i--) {
            for (int s = 0; s < n - i; s++) {
                System.out.print("-   ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*   ");
            }
            endColumn();
        }
    }

    public static void hallowPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print("-   ");
            }
            for (int j = 0; j <= 2 * i; j++) {
                if (j==0||i==n-1||j==2*i) {
                    System.out.print("*   ");
                } else {
                    System.out.print("    ");
                }
               
            }
            endColumn();
        }
    }

    // Numbering patterns

    public static void increasingNumberTriangle(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                count++;
                System.out.print(count + "  ");
            }
            endColumn();
        }
    }
    
    public static void decreasingNumberTriangle(int n) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                count++;
            }
        }
        count++;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                count--;
                System.out.print(count + "  ");
            }
            endColumn();
        }
    }

    public static void pascalTriangle(int n) {

        // Loop for each row
        for (int i = 0; i < n; i++) {

            // Print spaces before the numbers
            int spaces = n - i - 1;

            for (int s = 0; s < spaces; s++) {
                System.out.print("  ");
            }

            // First number in every row is always 1
            int number = 1;

            // Print numbers in the current row
            for (int j = 0; j <= i; j++) {

                // Print the current number
                System.out.print(number + "   ");

                // Calculate the next number
                number = number * (i - j) / (j + 1);
            }

            // Move to the next line
            endColumn();
        }
    }

    public static void alphabetPattern(int n) {
        char alphabet = 'A';
        int alphabetCount = 0;

        for (int i = 0; i < n; i++) {

            for (int space = 0; space < n - i; space++) {
                System.out.print("    ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(alphabet + "   ");
                alphabetCount++;
                alphabet = (char) ('A' + alphabetCount % 26);

            }

            endColumn();
        }

    }

    public static void reverseAlphabetPattern(int n) {
        char alphabet = 'Z';
        int alphabetCount = 0;

        for (int i = 0; i < n; i++) {

            for (int space = 0; space < n - i; space++) {
                System.out.print("    ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(alphabet + "   ");
                alphabetCount++;
                alphabet = (char) ('Z' - alphabetCount % 26);
            }

            endColumn();
        }
    }
}