package Chapter04;
//3 (Loyalty card discount) Write a program that reads the following information
//and prints discount information for the customer’s loyalty card at the local café:
//■ Customer’s name (e.g., Nessa)
//■ Number of coffees bought in total (e.g, 35)
//■ Coffee price (e.g., 3)
//■ Standard discount rate (e.g., 15%)
//■ Mailing list member discount rate (e.g., 3%)
//Enter customer’s name: Nessa
//Enter number of coffees bought in total: 35
//Enter average coffee price: 3
//Enter standard discount rate: 0.15
//Enter mailing-list member discount rate: 0.03
//Customer Name: Nessa
//Coffees Bought: 35.00
//Average Coffee Price: $3
//Total Spending on Coffee: $105.00
//Discounts:
// Standard discount (15.00%): $15.75
// Mailing list membership discount (3.0%): $3.15
// Total Saved: $18.90
//Total Spending after Discount: $86.10

import java.util.Scanner;

public class exercise23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter customer's name: ");
        String name = input.next();
        System.out.print("Enter number of coffees bough in total: ");
        int boughtCoffees = input.nextInt();
        System.out.print("Enter average coffee price: ");
        double averagePrice = input.nextDouble();
        System.out.print("Enter standard discount rate: ");
        double standardDiscountRate = input.nextDouble();
        System.out.print("Enter mailing list member discount rate: ");
        double mailingListDiscountRate = input.nextDouble();

        double totalSpending = boughtCoffees * averagePrice;
        double standardDiscountAmount = standardDiscountRate * totalSpending;
        double mailingDiscountAmount = mailingListDiscountRate * totalSpending;
        double totalSaved = standardDiscountAmount + mailingDiscountAmount;
        double spendingAfterDiscount = totalSpending - totalSaved;

        System.out.println("Customer Name: " + name);
        System.out.println("Coffees Bought: " + boughtCoffees);
        System.out.printf("Average Coffee Price: $%.2f\n", averagePrice);
        System.out.printf("Total Spending on Coffee: $%.2f\n", totalSpending);
        System.out.println("Discounts:");
        System.out.printf("\tStandard discount (%.2f%%): $%.2f\n", standardDiscountRate * 100, standardDiscountAmount);
        System.out.printf("\tMailing list membership discount (%.2f%%): $%.2f\n", mailingListDiscountRate, mailingDiscountAmount);
        System.out.printf("\tTotal Saved: $%.2f\n", totalSaved);
        System.out.printf("Total Spending after Discount: $%.2f", spendingAfterDiscount);
    }

}
