package Chapter07;
//(Statistics: compute deviation) Programming Exercise 5.45 computes the standard
//deviation of numbers. This exercise uses a different but equivalent formula to
//compute the standard deviation of n numbers.
//mean =
//a
//n
//i=1
//xi
//n = x1 + x2 + g + xn
//n deviation = H
//a
//n
//i=1
//(xi - mean)
//2
//n - 1
// To compute the standard deviation with this formula, you have to store the individual numbers using an array, so they can be used after the mean is obtained.
// Your program should contain the following methods:
///** Compute the deviation of double values */
//public static double deviation(double[] x)
///** Compute the mean of an array of double values */
//public static double mean(double[] x)
// Write a test program that prompts the user to enter 10 numbers and displays the
//mean and standard deviation, as presented in the following sample run:
//Enter 10 numbers: 1.9 2.5 3.7 2 1 6 3 4 5 2
//The mean is 3.11
//The standard deviation is 1.55738

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double[] array = new double[10];
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
        }

        System.out.println("The mean is " + mean(array));
        System.out.println("The standard deviation is " + deviation(array));

    }

    /** Compute the deviation of double values */
    public static double deviation(double[] x) {
        double deviationNumerator = 0;
        for (int i = 0; i < 10; i++) {
            deviationNumerator += Math.pow(x[i] - mean(x), 2);
        }
        return Math.sqrt(deviationNumerator / (10 - 1));
    }

    /** Compute the mean of an array of double values */
    public static double mean(double[] x) {
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += x[i];
        }
        return sum / 10;
    }
}
