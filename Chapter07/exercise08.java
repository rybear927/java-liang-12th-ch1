package Chapter07;
//(Average an array) Write two overloaded methods that return the average of an
//array with the following headers:
//public static double average(int[] array)
//public static double average(double[] array)
// Write a test program that prompts the user to enter 10 integers, invokes the first
//method, then displays the average value; prompts the user to enter 10 double
//values, invokes the second method, then displays the average value.

import java.util.Scanner;

public class exercise08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] intArray = new int[10];
        double[] doubleArray = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter an integer: ");
            intArray[i] = input.nextInt();
        }
        System.out.println("The average of the integers you entered is " + average(intArray));

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a double: ");
            doubleArray[i] = input.nextDouble();
        }
        System.out.println("The average of the doubles you entered is " + average(doubleArray));

    }

    public static double average(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}
