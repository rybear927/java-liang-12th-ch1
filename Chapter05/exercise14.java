package Chapter05;
//(Compute the greatest common divisor) Another solution for Listing 5.9 to find
//the greatest common divisor of two integers n1 and n2 is as follows: First find d
//to be the minimum of n1 and n2, then check whether d, d–1, d–2, …, 2, or 1 is
//a divisor for both n1 and n2 in this order. The first such common divisor is the
//greatest common divisor for n1 and n2. Write a program that prompts the user to
//enter two positive integers and displays the gcd.

import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        if (secondNumber > firstNumber) {
            int temp = secondNumber;
            secondNumber = firstNumber;
            firstNumber = temp;
        }

        for (int i = firstNumber; i > 0; i--) {
            if (secondNumber % i == 0 && firstNumber % i == 0) {
                System.out.println("The greatest common divisor for " + firstNumber + " and " + secondNumber + " is " + i);
                break;
            }
        }
    }
}
