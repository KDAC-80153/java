package sunbeam.info;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the pattern

        // Loop to print the upper part of the pattern
        for (int i = 1; i <= n; i += 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Loop to print the lower part of the pattern
        for (int i = n - 2; i >= 1; i -= 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}