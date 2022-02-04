package Chapter02;
//(Find the number of years) Write a program that prompts the user to enter the
//minutes (e.g., 1 billion), and displays the maximum number of years and remaining
//days for the minutes. For simplicity, assume that a year has 365 days. Here is
//a sample run:
//Enter the number of minutes: 1000000000
//1000000000 minutes is approximately 1902 years and 214 days

import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();
        long originalMinutes = minutes;
        minutes = minutes / 60 / 24;
        long years = minutes / 365;
        long days = minutes % 365;

        System.out.println(originalMinutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
