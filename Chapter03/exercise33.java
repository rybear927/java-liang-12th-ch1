package Chapter03;
//(Financial: compare costs) Suppose you shop for rice in two different packages.
//You would like to write a program to compare the cost. The program prompts the
//user to enter the weight and price of each package and displays the one with the
//better price. Here is a sample run:
//Enter weight and price for package 1: 50 24.59
//Enter weight and price for package 2: 25 11.99
//Package 2 has a better price.

import java.util.Scanner;

public class exercise33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight and price for package 1: ");
        double package1Weight = input.nextDouble();
        double package1Price = input.nextDouble();

        System.out.print("Enter weight and price for package 2: ");
        double package2Weight = input.nextDouble();
        double package2Price = input.nextDouble();

        if (package1Price / package1Weight < package2Price / package2Weight) {
            System.out.println("Package 1 has a better price");
        } else {
            System.out.println("Package 2 has a better price");
        }
    }
}
