package Chapter04;
//Write a program that receives a character and
//displays its ASCII code (an integer between 0 and 127). Here is a sample run:
//Enter a character: E
//The ASCII code for character E is 69

import java.util.Scanner;

public class exercise08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char userCharacter = input.next().charAt(0);

        System.out.println("The ASCII code for character " + userCharacter + " is " + (int)userCharacter);
    }
}
