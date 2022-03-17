package Chapter07;
//(Check whether array is sorted) An array list is required to be sorted in ascending order. Write a method that returns true if list is sorted, using the following
//header:
//public static boolean isSorted(int[] list)
// Write a test program that prompts the user to enter a list of integers. Note the first
//number in the input indicates the number of elements in the list. This number is not
//part of the list.
//Enter list: 5 2 5 6 9 10
//The list is sorted
//Enter list: 5 2 5 6 1 6
//The list is not sorted

import java.util.Scanner;

public class exercise26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int listSize = input.nextInt();
        int[] list = new int[listSize];
        for (int i = 0; i < listSize; i++) {
            list[i] = input.nextInt();
        }
        if (isSorted(list)) {
            System.out.println("The list is sorted.");
        } else {
            System.out.println("The list is not sorted.");
        }
    }

    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //helper methods that I will copy/paste to exercises for speeding up testing purposes
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
