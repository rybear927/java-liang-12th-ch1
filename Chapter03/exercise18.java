package Chapter03;
//(Cost of shipping) A shipping company uses the following function to calculate
//the cost (in dollars) of shipping based on the weight of the package (in pounds).
//c(w) = d
//2.5, if 0 6 w 6 = 2
//4.5, if 2 6 w 6 = 4
//7.5, if 4 6 w 6 = 10
//10.5, if 0 6 w 6 = 20
//Write a program that prompts the user to enter the weight of the package and
//display the shipping cost. If the weight is greater than 20, display a message “the
//package cannot be shipped.”


import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class exercise18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of the package: ");
        double weight = input.nextDouble();


        if (weight <= 2) {
            System.out.println("The cost to ship this package is $2.50");
        } else if (weight <= 4) {
            System.out.println("The cost to ship this package is $4.50");
        } else if (weight <= 10) {
            System.out.println("The cost to ship this package is $7.50");
        } else if (weight <= 20) {
            System.out.println("The cost to ship this package is $10.50");
        } else {
            System.out.println("The package cannot be shipped.");
        }
    }
}
