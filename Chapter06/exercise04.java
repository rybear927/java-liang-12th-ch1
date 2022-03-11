package Chapter06;
//(Display an integer reversed) Write a method with the following header to display an integer in reverse order:
//public static void reverse(int number)
//For example, reverse(3456) displays 6543. Write a test program that prompts
//the user to enter an integer then displays its reversal.

import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        reverse(input.nextInt());

    }

    public static void reverse(int number) {
        String numberString = number + "";
        String output = "";
        for (int i = numberString.length() - 1; i >= 0; i--) {
            output += numberString.charAt(i);
        }
        System.out.println(output);
    }
}
