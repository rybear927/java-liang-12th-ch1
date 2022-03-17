package Chapter07;
//(Find the index of the largest element) Write a method that returns the index of the
//largest element in an array of integers. If there is more than one element, return
//the largest index. Use the following header:
//public static int indexOfLargestElement(double[] array)
// Write a test program that prompts the user to enter 10 numbers, invokes this
//method to return the index of the largest element, and displays the index and the
//element itself.

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];
        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
        }

        System.out.println("The index of the largest element is " + indexOfLargestElement(array) + " and the " +
                "element is " + array[indexOfLargestElement(array)]);
    }

    public static int indexOfLargestElement(double[] array) {
        double max = 0;
        int indexOfMax = 0;
        for (int i = 0; i < 10; i++) {
            if (max < array[i]){
                max = array[i];
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }
}
