package sunbeam.info;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first double value: ");
        if (input.hasNextDouble()) {
            double num1 = input.nextDouble();
            System.out.print("Enter the second double value: ");
            if (input.hasNextDouble()) {
                double num2 = input.nextDouble();

                // Calculate and print the average
                double average = (num1 + num2) / 2;
                System.out.println("Average: " + average);
            } else {
                System.out.println("Error: Second input is not a double.");
            }
        } else {
            System.out.println("Error: First input is not a double.");
        }

        input.close();
    }
}