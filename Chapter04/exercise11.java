package Chapter04;

import java.util.Scanner;

//(Binary to decimal) Write a program that prompts the user to enter binary digits
//and displays its corresponding decimal value. Here are some sample runs:
//Enter binary digits (0000 to 1111): 0111
//The decimal value is 7
public class exercise11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter binary digits (0000 to 1111): ");
        String binaryDigits = input.next();
        int counter = 1;
        int decimalValue = 0;

        for (int i = 3; i >= 0; i--) {
            if (binaryDigits.charAt(i) == '1') {
                decimalValue += counter;
            }
            counter *= 2;
        }

        System.out.println("The decimal value is " + decimalValue);

    }
}
