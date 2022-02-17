package Chapter03;
//(Financials: currency exchange) Write a program that prompts the user to enter
//the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the
//user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert
//from Chinese
//RMB to U.S. dollars. Prompt the user to enter the amount in U.S.
//dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
//Here are the sample runs:
//Enter the exchange rate from dollars to RMB: 6.81
//Enter 0 to convert dollars to RMB and 1 vice versa: 0
//Enter the dollar amount: 100
//$100.0 is 681.0 yuan

import java.util.Scanner;

public class exercise31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dollars;
        double RMB;

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double dollarsToRMBExchangeRate = input.nextDouble();

        System.out.print("Enter 0 to convert dollars to RMB and 1 vis versa: ");
        int RMBOrDollars = input.nextInt();

        if (RMBOrDollars == 0) {
            System.out.print("Enter the dollar amount: ");
            dollars = input.nextDouble();
            System.out.println("$" + dollars + " is " + (dollars * dollarsToRMBExchangeRate) + " yuan");
        } else if (RMBOrDollars == 1){
            System.out.print("Enter the RMB amount: ");
            RMB = input.nextDouble();
            System.out.println(RMB + " yuan is $" + (RMB / dollarsToRMBExchangeRate));
        } else {
            System.out.println("Incorrect Input");
        }
    }
}
