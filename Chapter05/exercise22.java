package Chapter05;
//(Financial application: loan amortization schedule) The monthly payment for a given
//loan pays the principal and the interest. The monthly interest is computed by multiplying the monthly interest rate and the balance (the remaining principal). The principal
//paid for the month is therefore the monthly payment minus the monthly interest. Write
//a program that lets the user enter the loan amount, number of years, and interest rate
//then displays the amortization schedule for the loan. Here is a sample run:
//VideoNote
//Display loan schedule
//Loan Amount: 10000
//Number of Years: 1
//Annual Interest Rate: 7
//Monthly Payment: 865.26
//Total Payment: 10383.21
//Payment# Interest Principal Balance
//1 58.33 806.93 9193.07
//2 53.62 811.64 8381.43
//...
//11 10.00 855.26 860.27
//12 5.01 860.25 0.01

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercise22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double balance = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();


        // Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Calculate payment
        double monthlyPayment = balance * monthlyInterestRate / (1
                - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Monthly Payment: " + df.format(monthlyPayment));
        System.out.println("Total Payment: " + df.format(totalPayment));

        System.out.println("");
        for (int i = 1; i <= numberOfYears * 12; i++) {
            double interest = monthlyInterestRate * balance;
            double principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.println(i + "\t\t" + df.format(interest) + "\t\t" + df.format(principal) + "\t\t" + df.format(balance));
        }
    }
}
