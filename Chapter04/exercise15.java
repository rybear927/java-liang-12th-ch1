package Chapter04;
//(Phone key pads) The international standard letter/number mapping found on the
//telephone is shown below:
//Write a program that prompts the user to enter a lowercase or uppercase letter
//and displays its corresponding number. For a nonletter input, display invalid
//input.
//Enter a letter: A
//The corresponding number is 2
//Enter a letter: a
//The corresponding number is 2
//Enter a

import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a  letter: ");
        char userLetter = input.next().charAt(0);

        if (!Character.isLetter(userLetter)) {
            System.out.println(userLetter + " is an invalid input");
        }

        char letter = Character.toLowerCase(userLetter);

        if ((int)letter >= 97 && (int)letter <= 99) {
            System.out.println("The corresponding number is 2");
        } else if ((int)letter >= 100 && (int)letter <= 102) {
            System.out.println("The corresponding number is 3");
        } else if ((int)letter >= 103 && (int)letter <= 105) {
            System.out.println("The corresponding number is 4");
        } else if ((int)letter >= 106 && (int)letter <= 108) {
            System.out.println("The corresponding number is 5");
        } else if ((int)letter >= 109 && (int)letter <= 111) {
            System.out.println("The corresponding number is 6");
        } else if ((int)letter >= 112 && (int)letter <= 115) {
            System.out.println("The corresponding number is 7");
        } else if ((int)letter >= 116 && (int)letter <= 117) {
            System.out.println("The corresponding number is 8");
        } else {
            System.out.println("The corresponding number is 9");
        }


    }
}
