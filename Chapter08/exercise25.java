package Chapter08;
//(Markov matrix) An n * n matrix is called a positive Markov matrix if each
//element is positive and the sum of the elements in each column is 1. Write the
//following method to check whether a matrix is a Markov matrix:
//public static boolean isMarkovMatrix(double[][] m)
// Write a test program that prompts the user to enter a 3 * 3 matrix of double
//values and tests whether it is a Markov matrix. Here are sample runs:
//Enter a 3−by−3 matrix row by row:
/*
0.15 0.875 0.375
0.55 0.005 0.225
0.30 0.12 0.4

//It is a Markov matrix
 */

import java.util.Scanner;

public class exercise25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input matrix of predetermined size
        double[][] array = new double[3][3];
        System.out.print("Enter a 3-by-3 matrix row by row: ");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = input.nextDouble();
            }
        }

        if (isMarkovMatrix(array)) {
            System.out.println("It is a Markov Matrix.");
        } else {
            System.out.println("It isn't a Markov Matrix.");
        }
    }

    public static boolean isMarkovMatrix(double[][] m) {
        //if each element is positive
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                if (m[row][column] < 0) {
                    return false;
                }
            }
        }

        //if each column adds to 1
        for (int i = 0; i < m[0].length; i++) {
            if (!columnAddsUpTo1(i, m)) {
                return false;
            }
        }
        return true;
    }

    public static boolean columnAddsUpTo1(int column, double[][] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][column];
        }
        if (sum == 1) {
            return true;
        }
        return false;
    }
}
