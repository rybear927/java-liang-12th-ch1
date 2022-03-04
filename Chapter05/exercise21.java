package Chapter05;
//(Financial application: compare loans with various interest rates) Write a program that lets the user enter the loan amount and loan period in number of years
//and displays the monthly and total payments for each interest rate starting from
//5% to 10%, with an increment of 1/4. Here is a sample run:
//Loan Amount: 10000
//Number of Years: 5
//Interest Rate Monthly Payment Total Payment
//5.000% 188.71 11322.74
//5.250% 189.86 11391.59
//5.500% 191.01 11460.70
//...
//9.750% 211.24 12674.55
//10.000% 212.47 12748.23


//note: I couldn't figure how to make the last line print correctly...something about printing the % sign
//fucks things up but I'm really at a loss on how to deal with it

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercise21 {
    public static void main(String[] args) {
        // Create a Scanner
        //Scanner input = new Scanner(System.in);

        // Enter yearly interest rate and years
        //System.out.print("Loan amount: ");
        double loanAmount = 10000;//input.nextDouble();
        //System.out.print("Number of years: ");
        double numberOfYears = 5;//input.nextDouble();

        System.out.println("Interest Rate    Monthly Payment    Total Payment");

        for (double i = 5.0; i <= 10.0 ; i += 0.250) {
            double annualInterestRate = i;

            // Obtain monthly interest rate
            double monthlyInterestRate = annualInterestRate / 1200;

            // Calculate payment
            double monthlyPayment = loanAmount * monthlyInterestRate / (1
                    - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
            double totalPayment = monthlyPayment * numberOfYears * 12;

            //print shit
            DecimalFormat df = new DecimalFormat("###.##");
            System.out.printf("%-1.3f%%        %-15s    %-1s\n", annualInterestRate, df.format(monthlyPayment), df.format(totalPayment));

        }


    }
}
