package Chapter04;
//(Hex to binary) Write a program that prompts the user to enter a hex digit and
//displays its corresponding binary number in four digits. For example, hex digit 7
//is 0111 in binary. Hex digits can be entered either in uppercase or lowercase. For
//an incorrect input, display invalid input. Here is a sample run:
//VideoNote
//Convert hex to binary
//Enter a hex digit: B
//The binary value is 1011
//Enter a hex digit: G
//G is an invalid input

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String binaryValue = "";

        System.out.print("Enter a hex digit: ");
        String hexString = input.nextLine();

        // Check if the hex string has exactly one character
        if (hexString.length() != 1) {
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }

        // Display decimal value for the hex digit
        char ch = Character.toUpperCase(hexString.charAt(0));
        if ('A' <= ch && ch <= 'F') {
            int value = ch - 'A' + 10;
            if (value > 7) {
                binaryValue = binaryValue + "1";
                value -= 8;
            } else {
                binaryValue = binaryValue + "0";
            }
            if (value > 3) {
                binaryValue = binaryValue + "1";
                value -= 4;
            } else {
                binaryValue = binaryValue + "0";
            }
            if (value > 1) {
                binaryValue = binaryValue + "1";
                value -= 2;
            } else {
                binaryValue = binaryValue + "0";
            }
            if (value == 1) {
                binaryValue = binaryValue + "1";
            } else {
                binaryValue = binaryValue + "0";
            }
            System.out.println("The binary value for hex digit "
                    + ch + " is " + binaryValue);
        } else {
            System.out.println(ch + " is an invalid input");
        }
    }
}
