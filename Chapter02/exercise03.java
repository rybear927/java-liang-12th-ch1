package Chapter02;
//(Convert meters into feet) Write a program that reads a number in meters, converts
//it to feet, and displays the result. One meter is 3.2786 feet. Here is a sample run:
//Enter a value for meter: 10
//10.0 meters is 32.786 feet

import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for meter: ");
        double output = input.nextDouble();

        System.out.println(output + " meters is " + output * 3.2786 + " feet");
    }
}
