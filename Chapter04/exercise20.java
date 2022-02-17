package Chapter04;
//(Process a string) Write a program that prompts the user to enter a string and
//displays its length and its last character.

import java.util.Scanner;

public class exercise20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        System.out.println("The length of the string is " + userInput.length());
        System.out.println("The last character is " + userInput.charAt(userInput.length() - 1));
    }
}
