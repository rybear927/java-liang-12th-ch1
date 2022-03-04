package Chapter05;
//(Reverse a string) Write a program that prompts the user to enter a string and
//displays the string in reverse order.
//Enter a string: ABCD
//The reversed string is DCBA

import java.util.Scanner;

public class exercise46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String output = "";

        System.out.print("Enter a string: ");
        String userInput = input.next();

        for (int i = userInput.length() - 1; i >= 0; i--) {
            output += userInput.charAt(i);
        }

        System.out.println("The reversed string is " + output);
    }
}
