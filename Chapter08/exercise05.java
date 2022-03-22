package Chapter08;
//(Algebra: add two matrices) Write a method to add two matrices. The header of
//the method is as follows:
//public static double[][] addMatrix(double[][] a, double[][] b)
// In order to be added, the two matrices must have the same dimensions and the
//same or compatible types of elements. Let c be the resulting matrix. Each element cij is aij + bij
//. For example, for two 2 * 2 matrices a and b, c is
//¢
//a11 a12
//a21 a22
//≤ + ¢
//b11 b12
//b21 b22
//≤ = ¢
//a11 + b11 a12 + b12
//a21 + b21 a22 + b22
//≤
// Write a test program that prompts the user to enter two 2 * 2 matrices and displays their sum. Here is a sample run:

import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input matrix of predetermined size
        double[][] array1 = new double[2][2];
        double[][] array2 = new double[2][2];
        System.out.print("Enter matrix1: ");
        for (int row = 0; row < array1.length; row++) {
            for (int column = 0; column < array1[row].length; column++) {
                array1[row][column] = input.nextDouble();
            }
        }
        System.out.print("Enter matrix2: ");
        for (int row = 0; row < array2.length; row++) {
            for (int column = 0; column < array2[row].length; column++) {
                array2[row][column] = input.nextDouble();
            }
        }

        double[][] matrix3 = addMatrix(array1, array2);
        System.out.println("The matrices are added as follows:");
        System.out.println(array1[0][0] + " " + array1[0][1] + "   " + array2[0][0] + " " + array2[0][1] + "   " + matrix3[0][0] + " " + matrix3[0][1]);
        System.out.println(array1[1][0] + " " + array1[1][1] + " + " + array2[1][0] + " " + array2[1][1] + " = " + matrix3[1][0] + " " + matrix3[1][1]);

    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] matrix = new double[a.length][a[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = a[i][j] + b[i][j];
            }
        }
        return matrix;
    }
}
