package Chapter03;
//(Find future dates) Write a program that prompts the user to enter an integer for
//today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also
//prompt the user to enter the number of days after today for a future day and display
//the future day of the week. Here is a sample run:
//Enter today’s day: 1
//Enter the number of days elapsed since today: 3
//Today is Monday and the future day is Thursday
//Enter today’s day: 0
//Enter the number of days elapsed since today: 31
//Today is Sunday and the future day is Wednesday

import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDays = input.nextInt();
        int output = 0;

        if ((today + elapsedDays) % 7 == 0) {
            output = today;
        } else if (((today + elapsedDays) % 7) == 1) {
            output = today + 1;
        } else if (((today) + elapsedDays % 7) == 2) {
            output = today + 2;
        } else if (((today) + elapsedDays % 7) == 3) {
            output = today + 3;
        } else if (((today) + elapsedDays % 7) == 4) {
            output = today + 4;
        } else if (((today) + elapsedDays % 7) == 5) {
            output = today + 5;
        } else if (((today) + elapsedDays % 7) == 6) {
            output = today + 6;
        }

        System.out.print("Today is ");
        if (today == 0) {
            System.out.print("Sunday");
        } else if (today == 1) {
            System.out.print("Monday");
        } else if (today == 2) {
            System.out.print("Tuesday");
        } else if (today == 3) {
            System.out.print("Wednesday");
        } else if (today == 4) {
            System.out.print("Thursday");
        } else if (today == 5) {
            System.out.print("Friday");
        } else if (today == 6) {
            System.out.print("Saturday");
        }
        System.out.print(" and the future day is ");
        if (output % 7 == 0) {
            System.out.print("Sunday");
        } else if (output % 7 == 1) {
            System.out.print("Monday");
        } else if (output % 7 == 2) {
            System.out.print("Tuesday");
        } else if (output % 7 == 3) {
            System.out.print("Wednesday");
        } else if (output % 7 == 4) {
            System.out.print("Thursday");
        } else if (output % 7 == 5) {
            System.out.print("Friday");
        } else if (output % 7 == 6) {
            System.out.print("Saturday");
        }
    }
}
