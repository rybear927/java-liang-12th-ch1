package Chapter03;
// (Palindrome integer) Write a program that prompts the user to enter a three-digit
//integer and determines whether it is a palindrome integer. An integer is palindrome
//if it reads the same from right to left and from left to right. A negative integer is
//treated the same as a positive integer. Here are sample runs of this program:
//Enter a three-digit integer: 121
//121 is a palindrome
//Enter a three-digit integer: 123
//123 is not a palindrome

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();
        int originalNumber = number;

        int digit1 = number % 10;
        number /= 10;
        int digit2 = number % 10;
        number /= 10;
        int digit3 = number;

        if (digit1 == digit3) {
            System.out.println(originalNumber + " is a palindrome");
        } else {
            System.out.println(originalNumber + " is not a palindrome");
        }
    }
}
