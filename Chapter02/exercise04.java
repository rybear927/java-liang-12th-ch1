package Chapter02;
//(Convert square meter into ping) Write a program that converts square meter into
//ping. The program prompts the user to enter a number in square meter, converts
//it to ping, and displays the result. One square meter is 0.3025 ping
//Here is a sample run:
//Enter a number in square meters: 50
//50.0 square meters is 15.125 pings

import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in square meters: ");
        double meters = input.nextDouble();

        System.out.println(meters + " square meters is " + meters * 0.3025 + " pings");
    }
}
