package Chapter06;
//(Phone keypads)  The international standard letter/number mapping for telephones is given in Programming Exercise 4.15. Write a method that returns a
//number, given an uppercase letter, as follows:
//public static int getNumber(char uppercaseLetter)
//Write a test program that prompts the user to enter a phone number as a string.
//The input number may contain letters. The program translates a letter (uppercase
//or lowercase) to a digit and leaves all other characters intact. Here are sample
//runs of the program:
//Enter a string: 1-800-Flowers
//1-800-3569377
//Enter a string: 1800flowers
//18003569377

import java.util.Scanner;

public class exercise21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String number = input.nextLine();
        String output = "";
        for (int i = 0; i < number.length(); i++) {
            if (Character.isLetter(number.charAt(i))) {
                output += getNumber(number.charAt(i));
            } else {
                output += number.charAt(i);
            }
        }

        System.out.println(output);
    }

    public static int getNumber(char uppercaseLetter) {
        char letter = Character.toLowerCase(uppercaseLetter);

        if ((int)letter >= 97 && (int)letter <= 99) {
            return 2;
        } else if ((int)letter >= 100 && (int)letter <= 102) {
            return 3;
        } else if ((int)letter >= 103 && (int)letter <= 105) {
            return 4;
        } else if ((int)letter >= 106 && (int)letter <= 108) {
            return 5;
        } else if ((int)letter >= 109 && (int)letter <= 111) {
            return 6;
        } else if ((int)letter >= 112 && (int)letter <= 115) {
            return 7;
        } else if ((int)letter >= 116 && (int)letter <= 117) {
            return 8;
        } else {
            return 9;
        }
    }
}
