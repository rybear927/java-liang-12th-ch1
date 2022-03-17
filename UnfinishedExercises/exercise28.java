package UnfinishedExercises;
//(Math: permutations) Write a program that prompts the user to enter four integers
//and then displays all possible ways of arranging the four integers.

import java.util.Scanner;

//this is from chapter 7

public class exercise28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter 4 integers: ");
//        int[] list = new int[4];
//        for (int i = 0; i < 4; i++) {
//            list[i] = input.nextInt();
//        }

        int[] list = {1, 2, 3, 4};
        printPermutations(list);

    }

    public static void printPermutations(int[] list) {
        int pointer = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                printArray(swap(i, j, swap(i, j, swap(i, j, swap(i, j, list)))));
            }

        }
    }

    public static int[] swap(int i, int j, int[] list) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
        return list;
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
