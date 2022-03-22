package Chapter08;

import java.util.Scanner;

//(Sum elements row by row) Write a method that returns the sum of all the elements in a specified row in a matrix using the following header:
//public static double sumRow(double[][] m, int rowIndex)
// Write a test program that reads a 3-by-4 matrix and displays the sum of each row.
//Here is a sample run:
//Enter a 3−by−4 matrix row by row:
//1.5 2 3 4
//5.5 6 7 8
//9.5 1 3 1
//Sum of the elements at row 0 is 10.5
//Sum of the elements at row 1 is 26.5
//Sum of the elements at row 2 is 14.5
public class exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input matrix of predetermined size
        double[][] array = new double[3][4];
        System.out.print("Enter a 3-by-4 matrix row by row: ");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = input.nextDouble();
            }
        }

        //printing
        for (int i = 0; i < 3; i++) {
            System.out.println("Sum of the elements in row " + i + " is " + getSumOfRow(array, i));
        }
    }

    public static double getSumOfRow(double[][] array, int row) {
        double sum = 0;
        for (int column = 0; column < array[row].length; column++) {
            sum += array[row][column];
        }
        return sum;
    }
}
