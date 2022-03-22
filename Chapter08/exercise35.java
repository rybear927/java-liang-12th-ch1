package Chapter08;

import java.util.Scanner;

/*
(Largest block) Given a square matrix with the elements 0 or 1, write a program to
find a maximum square submatrix whose elements are all 1s. Your program should
prompt the user to enter the number of rows in the matrix.
The program then displays the location of the first element in the maximum square submatrix and the
number of rows in the submatrix. Here is a sample run:

Enter the number of rows in the matrix: 5
Enter the matrix row by row:
1 0 1 0 1
1 1 1 0 1
1 0 1 1 1
1 0 1 1 1
1 0 1 1 1
The maximum square submatrix is at (2, 2) with size 3

Your program should implement and use the following method to find the maximum square submatrix:
public static int[] findLargestBlock(int[][] m)
 The return value is an array that consists of three values. The first two values are
the row and column indices for the first element in the submatrix, and the third
value is the number of the rows in the submatrix. For an animation of this problem,
see https://liveexample.pearsoncmg.com/dsanimation/LargestBlockeBook.html.
 */
public class exercise35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int numberOfRows = 3;//input.nexInt();

        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }

        System.out.println();
        helperMethods.printArray(matrix);
        int[] blockSizeInfo = findLargestBlock(matrix);
        System.out.println("The maximum square submatrix is at (" + blockSizeInfo[0] + ", " + blockSizeInfo[1] +
                ") with size " + blockSizeInfo[2]);

    }

    public static int getBlockSize(int row, int column, int[][] array) {
        int blockSize = 0;
        boolean foundAZero = false;
        while (!foundAZero) {
            for (int i = row; i <= row + blockSize; i++) {
                for (int j = column; j <= column + blockSize; j++) {
                    if (array[i][j] != 1) {
                        foundAZero = true;
                    }
                }
            }
            if (!foundAZero) {
                blockSize++;
            }
            if (row + blockSize == array.length || column + blockSize == array.length) {
                foundAZero = true;
            }
        }
        return blockSize;
    }

    public static int[] findLargestBlock(int[][] m) {
        int largestBlockSize = 0;
        int rowOfLargestBlock = 0;
        int columnOfLargestBlock = 0;
        int sizeOfCurrentBlock = 0;

        //go through each element
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sizeOfCurrentBlock = getBlockSize(i, j, m);
                if (sizeOfCurrentBlock > largestBlockSize) {
                    largestBlockSize = sizeOfCurrentBlock;
                    rowOfLargestBlock = i;
                    columnOfLargestBlock = j;
                }
            }
        }
        int[] output = {rowOfLargestBlock, columnOfLargestBlock, largestBlockSize};
        return output;
    }
}
