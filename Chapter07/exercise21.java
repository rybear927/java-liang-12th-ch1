package Chapter07;
//(Normalizing integers) Write a program that prompts the user to enter 10 integers,
//and normalizes the integers to be in the range of 0 to 1 by dividing every integer
//with the largest integer. Display the 10 normalized real-valued numbers.

import java.util.Scanner;

public class exercise21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of 10 integers: ");
        int[] list = new int[10];
        for (int i = 0; i < 10; i++) {
            list[i] = input.nextInt();
        }
        System.out.print("The normalized array is ");
        printArray(getNormalizedList(list));

    }

    public static double[] getNormalizedList(int[] array) {
        int largestValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (largestValue < array[i]) {
                largestValue = array[i];
            }
        }

        double[] normalizedList = new double[array.length];
        for (int i = 0; i < normalizedList.length; i++) {
            normalizedList[i] = (double)array[i] / largestValue;
        }
        return normalizedList;
    }

    //helper methods that I will copy/paste to exercises for speeding up testing purposes
    public static void printArray(double[] array) {
        System.out.println(java.util.Arrays.toString(array));
    }

    public static void printArray(int[] array) {
        System.out.println(java.util.Arrays.toString(array));
    }

    public static void printArray(String[] array) {
        System.out.println(java.util.Arrays.toString(array));
    }
}
