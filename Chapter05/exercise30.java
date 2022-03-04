package Chapter05;
//(Financial application: compound value) Suppose you save $100 each month
//in a savings account with annual interest rate 3.75%. The monthly interest rate
//is 0.0375 / 12 = 0.003125. After the first month, the value in the account
//becomes
//100 * (1 + 0.003125) = 100.3125
// After the second month, the value in the account becomes
//(100 + 100.3125) * (1 + 0.003125) = 200.938
// After the third month, the value in the account becomes
//(100 + 200.938) * (1 + 0.003125) = 301.878
// and so on.
//Write a program that prompts the user to enter an amount (e.g., 100), the annual
//interest rate (e.g., 3.75), and the number of months (e.g., 6) and displays the
//amount in the savings account after the given month.

import java.util.Scanner;

public class exercise30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter the number of months: ");
        int numberOfMonths = input.nextInt();
        double monthlyInterestRate = annualInterestRate / 1200;
        double balance = 0.0;

        for (int i = 0; i < numberOfMonths; i++) {
            balance = (balance + amount) * (1 + monthlyInterestRate);
            System.out.printf("After month #%d, you will have %1.2f\n", (i + 1), balance);
        }
    }
}
