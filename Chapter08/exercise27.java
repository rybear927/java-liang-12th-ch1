package Chapter08;
/*
(Column sorting) Implement the following method to sort the columns in a two
dimensional array. A new array is returned and the original array is intact.
public static double[][] sortColumns(double[][] m)
Write a test program that prompts the user to enter a 4 * 4 matrix of double
values and displays a new column-sorted matrix. Here is a sample run:
Enter a 4−by−4 matrix row by row:
0.15 0.875 0.375 0.225
0.55 0.005 0.225 0.015
0.30 0.12 0.4 0.008
0.07 0.021 0.14 0.2
The column−sorted array is
0.07 0.005 0.14 0.008
0.15 0.021 0.225 0.015
0.30 0.12 0.375 0.2
0.55 0.875 0.4 0.225
 */
import java.util.Scanner;

public class exercise27 {
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
        System.out.println("The column-sorted array is: ");
        helperMethods.printArray(sortColumns(array));
    }

    public static void bubbleSortColumn(int column, double[][] sortedArray) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i][column] > sortedArray[i + 1][column]) {
                    double temp = sortedArray[i][column];
                    sortedArray[i][column] = sortedArray[i + 1][column];
                    sortedArray[i + 1][column] = temp;
                    unsorted = true;
                }
            }
        }
    }

    public static double[][] sortColumns(double[][] m) {
        //load the array into the new array
        double[][] sortedArray = new double[m.length][m[0].length];
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                sortedArray[row][column] = m[row][column];
            }
        }
        System.out.println("loading complete");

        //look at each row
        for (int i = 0; i < m.length; i++) {
            bubbleSortColumn(i, sortedArray);
        }

        return sortedArray;
    }
}
