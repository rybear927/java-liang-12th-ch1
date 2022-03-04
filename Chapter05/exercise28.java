package Chapter05;
//(Display the first days of each month) Write a program that prompts the user to
//enter the year and first day of the year, then displays the first day of each month
//in the year. For example, if the user entered the year 2013, and 2 for Tuesday,
//January 1, 2013, your program should display the following output:
//January 1, 2013 is Tuesday
//...
//December 1, 2013 is Sunday

import java.util.Scanner;

public class exercise28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the day (0 for Sunday, 1 for Monday, ...): ");
        int day = input.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear =
                (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        //this is right!!!
        System.out.println("January 1, " + year + " is a " + numberToDay(day));
        day = (day + 31) % 7;
        System.out.println("February 1, " + year + " is a " + numberToDay(day));
        if (isLeapYear) {
            day = (day + 29) % 7;
        } else {
            day = (day + 28) % 7;
        }
        System.out.println("March 1, " + year + " is a " + numberToDay(day));
        day = (day + 31) % 7;
        System.out.println("April 1, " + year + " is a " + numberToDay(day));
        day = (day + 30) % 7;
        System.out.println("May 1, " + year + " is a " + numberToDay(day));
        day = (day + 31) % 7;
        System.out.println("June 1, " + year + " is a " + numberToDay(day));
        day = (day + 30) % 7;
        System.out.println("July 1, " + year + " is a " + numberToDay(day));
        day = (day + 31) % 7;
        System.out.println("August 1, " + year + " is a " + numberToDay(day));
        day = (day + 31) % 7;
        System.out.println("September 1, " + year + " is a " + numberToDay(day));
        day = (day + 30) % 7;
        System.out.println("October 1, " + year + " is a " + numberToDay(day));
        day = (day + 31) % 7;
        System.out.println("November 1, " + year + " is a " + numberToDay(day));
        day = (day + 30) % 7;
        System.out.println("December 1, " + year + " is a " + numberToDay(day));
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
