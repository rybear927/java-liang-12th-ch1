package Chapter06;
//(Count the letters in a string) Write a method that counts the number of letters in
//a string using the following header:
//public static int countLetters(String s)
//Write a test program that prompts the user to enter a string and displays the number of letters in the string

import java.util.Scanner;

public class exercise20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        System.out.println("The number of letters in the string was " + countLetters(input.nextLine()));
    }

    public static int countLetters(String s) {
        int numberOfLetters = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                numberOfLetters++;
            }
        }
        return numberOfLetters;
    }
}
