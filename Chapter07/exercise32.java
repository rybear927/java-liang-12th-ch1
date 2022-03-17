package Chapter07;
//(Partition of a list) Write the following method that partitions the list using the
//first element, called a pivot:
//public static int partition(int[] list)
// After the partition, the elements in the list are rearranged so all the elements before
//the pivot are less than or equal to the pivot, and the elements after the pivot are
//greater than the pivot. The method returns the index where the pivot is located in
//the new list. For example, suppose the list is {5, 2, 9, 3, 6, 8}. After the partition,
//the list becomes {3, 2, 5, 9, 6, 8}. Implement the method in a way that takes at
//most list.length comparisons. See liveexample.pearsoncmg.com/dsanimation/QuickSortNeweBook.html for an animation of the implementation. Write a
//test program that prompts the user to enter the size of the list and the contents of
//the list and displays the list after the partition. Here is a sample run.

import java.util.Scanner;

public class exercise32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int listSize = input.nextInt();
        System.out.print("Enter list content: ");
        int[] list = new int[listSize];
        for (int i = 0; i < listSize; i++) {
            list[i] = input.nextInt();
        }

        partition(list);
        System.out.println("After the partition, the array is: " + java.util.Arrays.toString(list));

    }

    public static int partition(int[] list) {
        int pivot = list[0];
        int low = 1;
        int high = list.length - 1;
        for (int i = 1; i < list.length; i++) {
            if (list[low] <= pivot) {
                low++;
            } else if (list[high] >= pivot) {
                high--;
            } else if (list[high] <= pivot) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
                high--;
            }
        }
        //soooo, I started the for loop at 1 instead of 0 since the pivot is at 0...so there
        //wasn't a chance to run this final bit of code in the for loop...so, here it is
        int temp = list[high];
        list[high] = list[0];
        list[0] = temp;
        return high;
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
