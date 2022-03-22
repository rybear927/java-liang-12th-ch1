package Chapter08;

import java.util.Scanner;

//(Row sorting) Implement the following method to sort the rows in a two-dimensional array.
// A new array is returned and the original array is intact.
//public static double[][] sortRows(double[][] m)
// Write a test program that prompts the user to enter a 4 * 4 matrix of double
//values and displays a new row-sorted matrix. Here is a sample run:
/*
Enter a 4−by−4 matrix row by row:
0.15 0.875 0.375 0.225
0.55 0.005 0.225 0.015
0.30 0.12 0.4 0.008
0.07 0.021 0.14 0.2
The row−sorted array is
0.15 0.225 0.375 0.875
0.005 0.015 0.225 0.55
0.008 0.12 0.30 0.4
0.021 0.07 0.14 0.2
 */
public class exercise26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input matrix of predetermined size
        double[][] array = new double[4][4];
        System.out.print("Enter a 4-by-4 matrix row by row: ");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = input.nextDouble();
            }
        }

        System.out.println();
        System.out.println("The row-sorted array is: ");
        helperMethods.printArray(sortRows(array));
    }

    public static void bubbleSortRow(int row, double[][] sortedArray) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < sortedArray[row].length - 1; i++) {
                if (sortedArray[row][i] > sortedArray[row][i + 1]) {
                    double temp = sortedArray[row][i];
                    sortedArray[row][i] = sortedArray[row][i + 1];
                    sortedArray[row][i + 1] = temp;
                    unsorted = true;
                }
            }
        }
    }

    public static double[][] sortRows(double[][] m) {
        //load the array into the new array
        double[][] sortedArray = new double[m.length][m[0].length];
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
