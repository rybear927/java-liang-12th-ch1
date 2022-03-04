package Chapter05;
//(Display calendars) Write a program that prompts the user to enter the year and
//first day of the year and displays the calendar table for the year on the console. For
//example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013,
//your program should display the calendar for each month in the year, as follows:
//January 2013
//Sun Mon Tue Wed Thu Fri Sat
//1 2 3 4 5
//6 7 8 9 10 11 12
//13 14 15 16 17 18 19
//20 21 22 23 24 25 26
//27 28 29 30 31

import java.util.Scanner;

public class exercise29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the name of the first day in January of that year (0 for Sunday, 1 for Monday, ...): ");
        int day = input.nextInt();


        for (int i = 0; i < 12; i++) {
            System.out.println("       " + numberToMonth(i) + " " + year);
            System.out.println("___________________________");
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            for (int j = 1; j <= getDaysInMonth(i, year) + day; j++) {
                if (day >= j) {
                    System.out.print("    ");
                } else {
                    System.out.printf("%3d ", j - day);
                }
                if (j % 7 == 0) {
                    System.out.println();
                }
            }
            day = (day + getDaysInMonth(i, year)) % 7;
            System.out.println();
            System.out.println();
        }
    }

    public static int getDaysInMonth (int month, int year) {
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        switch (month) {
            case 1: if (isLeapYear) {
                return 29;
            } else {
                return 28;
            }
            case 8:
            case 3:
            case 5:
            case 10: return 30;
            default: return 31;
        }

    }

    public static String numberToMonth (int number) {
        switch (number) {
            case 0: return "January";
            case 1: return "February";
            case 2: return "March";
            case 3: return "April";
            case 4: return "May";
            case 5: return "June";
            case 6: return "July";
            case 7: return "August";
            case 8: return "September";
            case 9: return "October";
            case 10: return "November";
            case 11: return "December";
            default: return "Something went wrong.";
        }
    }

    public static String numberToDay (int number) {
        switch (number) {
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            default: return "Something went wrong.";
        }
    }
}
