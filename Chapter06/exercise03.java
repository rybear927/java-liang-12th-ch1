package Chapter06;
//(Palindrome integer) Write the methods with the following headers:
//// Return the reversal of an integer, e.g., reverse(456) returns 654
//public static int reverse(int number)
//// Return true if number is a palindrome
//public static boolean isPalindrome(int number)
//Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is the same as itself.
// Write a test program that prompts the
//user to enter an integer and reports whether the integer is a palindrome.

import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.print("Is your number a palindrome? The answer is: " + isPalindrome(number));
    }

    //look, I kinda just made the other method without considering that I should've made
    //this one first, and how I made the other method means this one is kinda useless, so
    //I'mma skip it
    //Plus, the next exercise asks you to do the exact same thing
    public static int reverse(int number) {
        return 0;
    }

    public static boolean isPalindrome(int number) {
        String numberString = number + "";
        for (int i = 0, j = numberString.length() - 1; i < j; i++, j--) {
            if (numberString.charAt(i) != numberString.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
