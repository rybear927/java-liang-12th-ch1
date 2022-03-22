package Chapter08;
//(Algebra: multiply two matrices) Write a method to multiply two matrices. The
//header of the method is:
//public static double[][]
// multiplyMatrix(double[][] a, double[][] b)
// To multiply matrix a by matrix b, the number of columns in a must be the same as
//the number of rows in b, and the two matrices must have elements of the same or
//compatible types. Let c be the result of the multiplication. Assume the column size
//of matrix a is n. Each element cij is ai1 * b1j + ai2 * b2j + g + ain * bnj
//.
//For example, for two 3 * 3 matrices a and b, c is
//£
//a11 a12 a13
//a21 a22 a23
//a31 a32 a33
//≥ * £
//b11 b12 b13
//b21 b22 b23
//b31 b32 b33
//≥ = £
//c11 c12 c13
//c21 c22 c23
//c31 c32 c33
//≥
// where cij = ai1 * b1j + ai2 * b2j + ai3 * b3j
//.
// Write a test program that prompts the user to enter two 3 * 3 matrices and
//displays their product. Here is a sample run:
///*
/*
1 2 3 4 5 6 7 8 9
0 2 4 1 4.5 2.2 1.1 4.3 5.2
*/
import java.util.Scanner;

public class exercise06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter matrix1: ");
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }
        System.out.print("Enter matrix2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = input.nextDouble();
            }
        }

        double[][] matrix3 = multiplyMatrix(matrix1, matrix2);

        printMatrices(matrix1, matrix2, matrix3);
    }

    public static void printMatrices(double[][] matrix1, double[][] matrix2, double[][] matrix3) {
        // top row
        for (int i = 0; i < 3; i++) {
            System.out.printf("%1.1f ", matrix1[0][i]);
        }
        System.out.print("   ");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%1.1f ", matrix2[0][i]);
        }
        System.out.print("   ");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%1.1f ", matrix3[0][i]);
        }
        System.out.println();
        // middle row
        for (int i = 0; i < 3; i++) {
            System.out.printf("%1.1f ", matrix1[1][i]);
        }
        System.out.print(" * ");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%1.1f ", matrix2[1][i]);
        }
        System.out.print(" = ");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%1.1f ", matrix3[1][i]);
        }
        System.out.println();
        // bottom row
        for (int i = 0; i < 3; i++) {
            System.out.printf("%1.1f ", matrix1[2][i]);
        }
        System.out.print("   ");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%1.1f ", matrix2[2][i]);
        }
        System.out.print("   ");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%1.1f ", matrix3[2][i]);
        }
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] matrix = new double[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                matrix[i][j] = a[i][j] * b[i][j];
            }
        }
        return matrix;
    }
}
