package Chapter08;

import java.util.Scanner;

/*
(Identical arrays) The two-dimensional arrays m1 and m2 are identical if they
have the same contents. Write a method that returns true if m1 and m2 are identical, using the following header:
public static boolean equals(int[][] m1, int[][] m2)
 Write a test program that prompts the user to enter two 3 * 3 arrays of integers
and displays whether the two are identical. Here are the sample runs:
51 25 22 6 1 4 24 54 6
51 22 25 6 1 4 24 54 6
The two arrays are identical
Enter list1: 51 5 22 6 1 4 24 54 6
Enter list2: 51 22 25 6 1 4 24 54 6
The two arrays are not identical
 */
public class exercise29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input matrix of predetermined size
        int[][] array1 = new int[3][3];
        System.out.print("Enter list1: ");
        for (int row = 0; row < array1.length; row++) {
            for (int column = 0; column < array1[row].length; column++) {
                array1[row][column] = input.nextInt();
            }
        }
        int[][] array2 = new int[3][3];
        System.out.print("Enter list2: ");
        for (int row = 0; row < array2.length; row++) {
            for (int column = 0; column < array2[row].length; column++) {
                array2[row][column] = input.nextInt();
            }
        }

        if (equals(array1, array2)) {
            System.out.println("The arrays are identical");
        } else {
            System.out.println("The arrays are not identical");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        int[][] tempArray1 = sortRows(m1);
        int[][] tempArray2 = sortRows(m2);
        for (int row = 0; row < tempArray1.length; row++) {
            for (int column = 0; column < tempArray1[row].length; column++) {
                if (tempArray1[row][column] != tempArray2[row][column]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void bubbleSortRow(int row, int[][] sortedArray) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < sortedArray[row].length - 1; i++) {
                if (sortedArray[row][i] > sortedArray[row][i + 1]) {
                    int temp = sortedArray[row][i];
                    sortedArray[row][i] = sortedArray[row][i + 1];
                    sortedArray[row][i + 1] = temp;
                    unsorted = true;
                }
            }
        }
    }

    public static int[][] sortRows(int[][] m) {
        //load the array into the new array
        int[][] sortedArray = new int[m.length][m[0].length];
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                sortedArray[row][column] = m[row][column];
            }
        }

        //look at each row
        for (int i = 0; i < m.length; i++) {
            bubbleSortRow(i, sortedArray);
        }

        return sortedArray;
    }
}

