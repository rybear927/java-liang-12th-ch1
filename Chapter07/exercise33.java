package Chapter07;
//(Month name) Write a program that prompts the user to enter an integer between 1 and
//12 and then displays the name of the month that corresponds to the integer entered by
//the user. For example, if the user enters three, the program should display March.

import java.util.Scanner;



public class exercise33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 12: ");
        System.out.println("The name of the month is " + getMonthName(input.nextInt()));

    }

    /** Get the English name for the month */
    public static String getMonthName(int month) {
        String[] monthsArray = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        return monthsArray[month - 1];
    }
}
