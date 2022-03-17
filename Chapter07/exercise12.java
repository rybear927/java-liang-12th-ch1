package Chapter07;
//(Reverse an array) The reverse method in Section 7.7 reverses an array by
//copying it to a new array. Rewrite the method that reverses the array passed in
//the argument and returns this array. Write a test program that prompts the user to
//enter 10 numbers, invokes the method to reverse the numbers, and displays the
//numbers.

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
        }
        System.out.println("The reverse order of the numbers you entered is: " + java.util.Arrays.toString(reverse(array)));
    }

    public static double[] reverse(double[] array) {
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            double temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }

    //helper methods that I will copy/paste to every exercise for speeding up testing purposes
    public static void printArray(double[] array) {
        System.out.println("The array is: " + java.util.Arrays.toString(array));
    }
    public static void printArray(int[] array) {
        System.out.println("The array is: " + java.util.Arrays.toString(array));
    }
    public static void printArray(String[] array) {
        System.out.println("The array is: " + java.util.Arrays.toString(array));
    }
}
