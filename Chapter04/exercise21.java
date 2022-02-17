package Chapter04;
//(Check IMEI number) Write a program that prompts a user to enter the
//International Mobile Equipment Identity (IMEI) number in the format
//DD-DDDDDD-DDDDDD-D, where D is a digit. Your program should check
//whether the input is valid. Here are sample runs:
//Enter an IMEI number: 12-345678-912345-2
//12-345678-912345-2 is a valid IMEI number
//Enter an IMEI number: 12-345678-912345
//12-345678-912345 is an invalid IMEI number

import java.util.Scanner;

public class exercise21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isValid = true;

        System.out.print("Enter an IMEI number: ");
        String userInput = input.next();

        for (int i = 0; i < userInput.length(); i++) {
            if (i == 2 || i == 9 || i == 16) {
                if (userInput.charAt(i) != '-') {
                    isValid = false;
                }
            } else if (!Character.isDigit(userInput.charAt(i))) {
                isValid = false;
            }
        }

        if (userInput.length() != 18) {
            isValid = false;
        }

        if (isValid) {
            System.out.println(userInput + " is a valid IMEI number");
        } else {
            System.out.println(userInput + " is an invalid IMEI number");
        }
    }

}

