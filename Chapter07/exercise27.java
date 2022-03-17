package Chapter07;
//(Check whether the array is sorted with constant interval) An array list is sorted
//with a constant interval if its elements are arranged in an ascending order and there
//is a constant difference between adjacent elements. Write a method that returns
//true if list is sorted with a constant interval, using the following header:
//public static boolean isSortedConstantInterval(int[] list)
// Write a test program that prompts the user to enter a list of integers. Note the first
//number in the input indicates the number of elements in the list. This number is
//not part of the list.
//Enter list: 5 2 5 6 9 10
//The list is not sorted with a constant interval
//Enter list: 5 2 4 6 8 10
//The list is sorted with a constant interval

import java.util.Scanner;

public class exercise27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int listSize = input.nextInt();
        int[] list = new int[listSize];
        for (int i = 0; i < listSize; i++) {
            list[i] = input.nextInt();
        }
        if (isSortedConstantInterval(list)) {
            System.out.println("The list is sorted with a constant interval.");
        } else {
            System.out.println("The list is not sorted with a constant interval.");
        }
    }

    public static boolean isSortedConstantInterval(int[] list) {
            if (hasConstantInterval(list) && isSorted(list)) {
                return true;
            }
            return false;
    }

    public static boolean hasConstantInterval(int[] list) {
        int interval = list[1] - list[0];
        for (int i = 1; i < list.length - 1; i++) {
            if (list[i + 1] - list[i] != interval) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

