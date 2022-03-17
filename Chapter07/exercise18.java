package Chapter07;
//(Bubble sort) Write a sort method that uses the bubble-sort algorithm. The
//bubble-sort algorithm makes several passes through the array. On each pass, successive neighboring pairs are compared. If a pair is not in order, its values are
//swapped; otherwise, the values remain unchanged. The technique is called a bubble sort or sinking sort because the smaller values gradually “bubble” their way to
//the top, and the larger values “sink” to the bottom. Write a test program that reads
//in 10 double numbers, invokes the method, and displays the sorted numbers.

import java.util.Scanner;

public class exercise18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            array[i] = input.nextDouble();
        }
        bubbleSort(array);
        printArray(array);

    }

    public static void bubbleSort(double[] array) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
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
