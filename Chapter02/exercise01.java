package Chapter02;
//(Convert mile to kilometer) Write a program that reads a mile in a double value
//from the console, converts it to kilometers, and displays the result. The formula
//for the conversion is as follows:
//1 mile = 1.6 kilometers
//Here is a sample run:
//Programming Exercises 93
//Enter miles: 96
//96 miles is 153.6 kilometers

import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter miles: ");
        double miles = input.nextDouble();

        System.out.println(miles + " miles is " + miles * 1.6 + " kilometers");
    }
}
