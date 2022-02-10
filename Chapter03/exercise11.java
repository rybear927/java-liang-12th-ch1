package Chapter03;
//(Find the number of days in a month) Write a program that prompts the user
//to enter the month and year and displays the number of days in the month. For
//example, if the user entered month 2 and year 2012, the program should display
//that February 2012 has 29 days. If the user entered month 3 and year 2015, the
//program should display that March 2015 has 31 days.

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month (0 - 11, sorry): ");
        int month = input.nextInt();

        System.out.print("Enter the year: ");
        int year = input.nextInt();
        String monthString;

        switch (month) {
            case 0:  monthString = "January";
                break;
            case 1:  monthString = "February";
                break;
            case 2:  monthString = "March";
                break;
            case 3:  monthString = "April";
                break;
            case 4:  monthString = "May";
                break;
            case 5:  monthString = "June";
                break;
            case 6:  monthString = "July";
                break;
            case 7:  monthString = "August";
                break;
            case 8:  monthString = "September";
                break;
            case 9: monthString = "October";
                break;
            case 10: monthString = "November";
                break;
            case 11: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
        boolean isLeapYear = (year % 4 == 0 && year % 100 == 0) || (year % 400 == 0);
        if (month == 1) {
            if (isLeapYear) {
                System.out.println(monthString + " " + year + " has 29 days");
            } else {
                System.out.println(monthString + " " + year + " has 28 days");
            }
        } else if (month == 8 || month == 3 || month == 5 || month == 10) {
            System.out.println(monthString + " " + year + " has 30 days");
        } else {
            System.out.println(monthString + " " + year + " has 31 days");
        }
    }

}
