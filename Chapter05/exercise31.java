package Chapter05;
//(Financial application: compute CD value) Suppose you put $10,000 into a CD
//with an annual percentage yield of 6.15%. After one month, the CD is worth
//10000 + 10000 * 6.15 / 1200 = 10051.25
// After two months, the CD is worth
//10051.25 + 10051.25 * 6.15 / 1200 = 10102.76
// After three months, the CD is worth
//10102.76 + 10102.76 * 6.15 / 1200 = 10154.53
// and so on.
//Write a program that prompts the user to enter an amount (e.g., 10000), the
//annual percentage yield (e.g., 6.15), and the number of months (e.g., 18) and
//displays a table as shown in the sample run.

import java.util.Scanner;

public class exercise31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount: ");
        double initialDeposit = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double annualPercentageYield = input.nextDouble();
        System.out.print("Enter maturity period (number of months): ");
        int months = input.nextInt();


        double balance = 0.0;

        System.out.println("Month   CD Value");
        for (int i = 1; i <= months; i++) {
            initialDeposit = initialDeposit + (initialDeposit * annualPercentageYield / 1200);
            System.out.printf("%-2d      %-2.2f\n", i, initialDeposit);
        }

        //with an annual percentage yield of 6.15%. After one month, the CD is worth
//10000 + 10000 * 6.15 / 1200 = 10051.25
// After two months, the CD is worth
//10051.25 + 10051.25 * 6.15 / 1200 = 10102.76
// After three months, the CD is worth
//10102.76 + 10102.76 * 6.15 / 1200 = 10154.53

    }

}
