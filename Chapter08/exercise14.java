package Chapter08;

import java.util.Scanner;

//(Explore matrix) Write a program that prompts the user to enter the length of a
//square matrix, randomly fills in 0s and 1s into the matrix, prints the matrix, and
//finds the rows, columns, and diagonals with all 0s or 1s. Here is a sample run of
//the program:
//Enter the size for the matrix: 4
//0111
//0000
//0100
//1111
//All 0s on row 2
//All 1s on row 4
//No same numbers on a column
//No same numbers on the major diagonal
//No same numbers on the sub−diagonal
public class exercise14 {
    public static void main(String[] args) {
        //set up the matrix
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int matrixSize = input.nextInt();
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }

        //print board
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        //check rows
        checkRows(matrix);

        //check columns
        checkColumns(matrix);

        //check diagonals
        checkDiagonals(matrix);
    }

    public static void checkDiagonals(int[][] matrix) {
        int numberOf0s = 0;
        int numberOf1s = 0;
        boolean foundADiagonal = false;

        //check top left to bottom right
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] == 1) {
                numberOf1s++;
            } else {
                numberOf0s++;
            }
            if (numberOf0s == matrix.length) {
                System.out.println("All 0s on major diagonal");
                foundADiagonal = true;
            } else if (numberOf1s == matrix.length) {
                System.out.println("All 1s on major diagonal");
                foundADiagonal = true;
            }
        }
        numberOf0s = 0;
        numberOf1s = 0;

        //check top right to bottom left
        for (int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--) {
            if (matrix[i][j] == 1) {
                numberOf1s++;
            } else {
                numberOf0s++;
            }
            if (numberOf0s == matrix.length) {
                System.out.println("All 0s on minor diagonal");
                foundADiagonal = true;
            } else if (numberOf1s == matrix.length) {
                System.out.println("All 1s on minor diagonal");
                foundADiagonal = true;
            }
        }

        if (!foundADiagonal) {
            System.out.println("No same numbers on a diagonal");
        }
    }

    public static void checkColumns(int[][] matrix) {
        int numberOf0s = 0;
        int numberOf1s = 0;
        boolean foundAColumn = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[j][i] == 1) {
                    numberOf1s++;
                } else {
                    numberOf0s++;
                }
            }
            if (numberOf0s == matrix.length) {
                System.out.println("All 0s on column " + i);
                foundAColumn = true;
            } else if (numberOf1s == matrix.length) {
                System.out.println("All 1s on column " + i);
                foundAColumn = true;
            }
            numberOf0s = 0;
            numberOf1s = 0;
        }
        if (!foundAColumn) {
            System.out.println("No same numbers on a column");
        }
    }

    public static void checkRows(int[][] matrix) {
        int numberOf0s = 0;
        int numberOf1s = 0;
        boolean foundARow = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    numberOf1s++;
                } else {
                    numberOf0s++;
                }
            }
            if (numberOf0s == matrix.length) {
                System.out.println("All 0s on row " + i);
                foundARow = true;
            } else if (numberOf1s == matrix.length) {
                System.out.println("All 1s on row " + i);
                foundARow = true;
            }
            numberOf0s = 0;
            numberOf1s = 0;
        }
        if (!foundARow) {
            System.out.println("No same numbers on a row");
        }
    }

}
