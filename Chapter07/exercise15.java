package Chapter07;
//(Eliminate duplicates) Write a method that returns a new array by eliminating the
//duplicate values in the array using the following method header:
//public static int[] eliminateDuplicates(int[] list)
// Write a test program that reads in 10 integers, invokes the method, and displays
//the distinct numbers separated by exactly one space. Here is a sample run of the
//program:
//Enter 10 numbers: 1 2 3 2 1 6 3 4 5 2
//The distinct numbers are: 1 2 3 6 4 5

import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();
        }

        int[] newArray = eliminateDuplicates(array);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");

        }

    }

    public static int[] eliminateDuplicates(int[] list){
        int distinctNumberCounter = 0;
        int[] tempList = new int[list.length];

        //go through the original list
        for (int i = 0; i < list.length; i++) {
            boolean copyExists = false;
            //for each number in the original list, check if it's already in the temp list
            for (int j = 0; j < tempList.length; j++) {
                if (tempList[j] == list[i]){
                    copyExists = true;
                    break;
                }
            }
            if (!copyExists) {
                tempList[distinctNumberCounter] = list[i];
                distinctNumberCounter++;
            }
        }
        int[] newList = new int[distinctNumberCounter];
        for (int i = 0; i < distinctNumberCounter; i++) {
            newList[i] = tempList[i];
        }
        return newList;
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
