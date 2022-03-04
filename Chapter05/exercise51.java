package Chapter05;
//(Longest common prefix) Write a program that prompts the user to enter two
//strings and displays the largest common prefix of the two strings. Here are some
//sample runs:
//Enter the first string: Welcome to C++
//Enter the second string: Welcome to programming
//The common prefix is Welcome to
//Enter the first string: Atlanta
//Enter the second string: Macon
//Atlanta and Macon have no common prefix

import java.util.Scanner;

public class exercise51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = input.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = input.nextLine();

        String commonPrefix = "";

        for (int i = 0; i < Math.min(firstString.length(), secondString.length()); i++) {
            if (firstString.charAt(i) == secondString.charAt(i)) {
                commonPrefix += firstString.charAt(i);
            }
        }

        if (commonPrefix.length() == 0) {
            System.out.println(firstString + " and " + secondString + " have no common prefix");
        } else {
            System.out.println("The common prefix is " + commonPrefix);
        }
    }
}
