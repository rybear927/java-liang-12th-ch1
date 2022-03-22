package Chapter08;
//(Average the major diagonal in a matrix) Write a method that averages all the
//numbers in the major diagonal in an n * n matrix of double values using the
//following header:
//public static double averageMajorDiagonal(double[][] m)
// Write a test program that reads a 4-by-4 matrix and displays the average of all its
//elements on the major diagonal. Here is a sample run:
//Enter a 4−by−4 matrix row by row:
//1 2 3 4.0
//5 6.5 7 8
//9 10 11 12
//13 14 15 16
//Average of the elements in the major diagonal is 8.625

import java.util.Scanner;

public class exercise02 {
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

        System.out.println("Average of the elements in the major diagonal is " + averageMajorDiagonal(array));


    }

    public static double averageMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = i; j <= i; j++) {
                sum += m[i][j];
            }
        }
        return sum / m.length;
    }
}
