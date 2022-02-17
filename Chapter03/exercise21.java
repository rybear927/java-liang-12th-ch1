package Chapter03;
//(Science: day of the week) Zeller’s congruence is an algorithm developed by
//Christian
//Zeller to calculate the day of the week. The formula is
//h = aq +
//26(m + 1)
//10 + k +
//k
//4 +
//j
//4 + 5jb,7
//where
//■■ h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4:
//Wednesday, 5: Thursday, and 6: Friday).
//■■ q is the day of the month.
//■■ m is the month (3: March, 4: April, ..., 12: December). January and February
//are counted as months 13 and 14 of the previous year.
//■■ j is
//year
//100
//.
//■■ k is the year of the century (i.e., year % 100).
//Note all divisions in this exercise perform an integer division. Write a program
//that prompts the user to enter a year, month, and day of the month, and displays
//the name of the day of the week. Here are some sample runs:
//Enter year: (e.g., 2012): 2015
//Enter month: 1−12: 1
//Enter the day of the month: 1−31: 25
//Day of the week is Sunday
//Enter year:

import java.util.Scanner;

public class exercise21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1−12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int dayOfMonth = input.nextInt();

        if (month == 1) {
            year--;
            month = 13;
        } else if (month == 2) {
            year--;
            month = 14;
        }

        int k = year % 100;
        int j = year / 100;

        int h = (dayOfMonth + ((26 * (month + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        System.out.print("Day of the week is ");

        switch (h) {
            case 0:
                System.out.print("Saturday");
                break;
            case 1:
                System.out.print("Sunday");
                break;
            case 2:
                System.out.print("Monday");
                break;
            case 3:
                System.out.print("Tuesday");
                break;
            case 4:
                System.out.print("Wednesday");
                break;
            case 5:
                System.out.print("Thursday");
                break;
            case 6:
                System.out.print("Friday");
                break;
            default:
                System.out.print("unclear. There was an error.");
                break;
        }
    }
}
