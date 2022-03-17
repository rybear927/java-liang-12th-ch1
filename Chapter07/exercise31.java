package Chapter07;
//(Merge two sorted lists) Write the following method that merges two sorted lists
//into a new sorted list:
//public static int[] merge(int[] list1, int[] list2)
// Implement the method in a way that takes at most list1.length + list2.
//length comparisons. See liveexample.pearsoncmg.com/dsanimation/
//MergeSortNeweBook.html for an animation of the implementation. Write a test
//program that prompts the user to enter two sorted lists and displays the merged
//list. Here is a sample run. Note the first number in the input indicates the number
//of the elements in the list. This number is not part of the list.

import java.util.Scanner;

public class exercise31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1 size and contents: ");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list2 size and contents: ");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        bubbleSort(list1);
        bubbleSort(list2);
        System.out.print("The merged list is ");
        int[] mergedList = merge(list1, list2);
        for (int i = 0; i < mergedList.length; i++) {
            System.out.print(mergedList[i] + " ");

        }

    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] masterList = new int[list1.length + list2.length];
        for (int i = 0, list1marker = 0, list2marker = 0; i < list1.length + list2.length; i++) {
            if (list1marker != list1.length && list1[list1marker] < list2[list2marker]) {
                masterList[i] = list1[list1marker];
                list1marker++;
            } else if (list2marker != list2.length){
                masterList[i] = list2[list2marker];
                list2marker++;
            }
        }
        return masterList;
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

    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void bubbleSort(double[] array) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
    }

    public static void bubbleSort(int[] array) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
    }
}
