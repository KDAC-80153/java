package sunbeam.info;

public class Pattern2 {
    public static void main(String[] args) {
        int n = 6; // Number of rows in the pattern

        // Loop to print the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
