package Chapter02;
//(Financial application: calculate tips) Write a program that reads the subtotal
//and the gratuity rate and then computes the gratuity and total. For example, if the
//user enters 10 for subtotal and 12% for gratuity rate, the program displays $1.2
//as gratuity and $11.2 as total. Here is a sample run:
//Enter the subtotal and a gratuity rate: 10 12
//The gratuity is $1.2 and total is $11.2

import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();

        double outputGratuity = gratuity * 0.01 * subtotal;
        double total = outputGratuity + subtotal;

        System.out.println("The gratuity is $" + outputGratuity + " and total is $" + total);


    }
}
