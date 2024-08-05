package pattern;

public class Patterns {
    // for Inverted Pyramid
    static void invertedPyramid(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for star
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Inverted half-with numbers
    static void invert_half_num(int n) {
        // outer loop
        for (int i = 0; i < n; i++) {
            // for printing stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Floyd Triangle
    static void floyd_triangle(int n) {
        int k = 1;
        // for outer loop
        for (int i = 1; i <= n; i++) {
            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }

    // 0-1 Triangle
    static void binary_triangle(int n) {
        // for outer
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                int sum = i + j; // sum of outer & inner loop
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.err.print("0 ");
                }
            }
            System.out.println();
        }
    }

    static void butterfly(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                // for printing 1st half-1st part
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            // for printing spaces in 1st half
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            // for printing 1st half - 2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = n; i >= 1; i--) {
            // 2nd half-1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            // for spaces
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            // 2nd half-2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void rhombus(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int k = 1; k <= 5; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void hollow_rhombus(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for hollow rhombus
            for (int k = 1; k <= n; k++) {
                if (i == 1 || i == n || k == 1 || k == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void diamond(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // for printting spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for printing star
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.err.println();
        }
        // 2nd half
        for (int i = n; i >= 1; i--) {
            // for printting spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for printing star
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // invertedPyramid(5);
        // invert_half_num(5);
        // floyd_triangle(5);
        // binary_triangle(5);
        // butterfly(5);
        // rhombus(5);
        // hollow_rhombus(8);
        diamond(5);
    }

}