package sunbeam.info;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

  
        System.out.print("Enter the number of customers: ");
        int numCustomers = input.nextInt();

        for (int i = 1; i <= numCustomers; i++) {
            System.out.println("Customer " + i + ":");
            System.out.print("Enter account number: ");
            int accountNumber = input.nextInt();
            System.out.print("Enter balance at the beginning of the month: ");
            int beginningBalance = input.nextInt();
            System.out.print("Enter total of all items charged this month: ");
            int totalCharges = input.nextInt();
            System.out.print("Enter total of all credits applied this month: ");
            int totalCredits = input.nextInt();
            System.out.print("Enter allowed credit limit: ");
            int creditLimit = input.nextInt();

          
            int newBalance = beginningBalance + totalCharges - totalCredits;

           
            System.out.println("New balance: " + newBalance);

        
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            } else {
                System.out.println("Credit limit not exceeded");
            }

            System.out.println(); 
        }

        input.close();
    }
}