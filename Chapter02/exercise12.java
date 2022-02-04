package Chapter02;
//(Physics: finding runway length) Given an airplane’s acceleration a and take-off
//speed v, you can compute the minimum runway length needed for an airplane to
//take off using the following formula:
//length =
//v2
//2a
//Write a program that prompts the user to enter v in meters/second (m/s) and the acceleration
//a in meters/second squared (m/s2), then, displays the minimum runway length.
//Enter speed and acceleration: 60 3.5
//The minimum runway length for this airplane is 514.286

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        double minimumLength = (Math.pow(speed, 2) / (2 * acceleration));

        System.out.println("The minimum runway length for this airplane is " + minimumLength);
    }
}
