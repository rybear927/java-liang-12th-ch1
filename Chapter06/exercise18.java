package Chapter06;
//(Check password) Some websites impose certain rules for passwords. Write a
//method that checks whether a string is a valid password. Suppose the password
//rules are as follows:
//■ A password must have at least ten characters.
//■ A password consists of only letters and digits.
//■ A password must contain at least three digits.
//Write a program that prompts the user to enter a password and displays Valid
//Password if the rules are followed or Invalid Password otherwise.

import java.util.Scanner;

public class exercise18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password to check if it's valid: ");
        if (isValidPassword(input.nextLine())) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }


    public static boolean isValidPassword(String password) {

        //■ A password must have at least ten characters.
        if (password.length() < 10) {
            return false;
        }

       // ■ A password consists of only letters and digits.
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetter(password.charAt(i)) && !Character.isDigit(password.charAt(i))) {
                return false;
            }
        }

        //■ A password must contain at least three digits.
        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                digitCount++;
            }
        }
        if (digitCount < 3) {
            return false;
        }

        return true;
    }
}
