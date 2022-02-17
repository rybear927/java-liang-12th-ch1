package Chapter04;
//(Financial application: monetary units) Rewrite Listing 2.10, ComputeChange.
//java, to fix the possible loss of accuracy when converting a float value to an int
//value. Read the input as a string such as "11.56". Your program should extract the dollar amount before the decimal point, and the cents after the decimal
//amount using the indexOf and substring methods.

import java.util.Scanner;

public class exercise26 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print(
                "Enter an amount, for example 11.56: ");
        String amountString = input.next();

        String dollarsString = amountString.substring(0, amountString.indexOf('.'));
        String centsString = amountString.substring(amountString.indexOf('.') + 1);




        // Find the number of one dollars
        int numberOfOneDollars = Integer.parseInt(dollarsString);

        int remainingAmount = Integer.parseInt(centsString);

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        // Display results
        System.out.println("Your amount " + amountString + " consists of");
        System.out.println("    " + numberOfOneDollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters ");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickels + " nickels");
        System.out.println("    " + numberOfPennies + " pennies");

    }
}
