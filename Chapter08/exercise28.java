package Chapter08;

import java.util.Scanner;

//(Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
//identical if their corresponding elements are equal. Write a method that returns
//true if m1 and m2 are strictly identical, using the following header:
//public static boolean equals(int[][] m1, int[][] m2)
// Write a test program that prompts the user to enter two 3 * 3 arrays of integers
//and displays whether the two are strictly identical. Here are the sample runs:
/*
Enter list1: 51 22 25 6 1 4 24 54 6
Enter list2: 51 22 25 6 1 4 24 54 6
The two arrays are strictly identical
Enter list1: 51 25 22 6 1 4 24 54 6
Enter list2: 51 22 25 6 1 4 24 54 6
The two arrays are not strictly identical
 */
public class exercise28 {
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
            System.out.println("The arrays are strictly identical");
        } else {
            System.out.println("The arrays are not strictly identical");
        }


    }

    public static boolean equals(int[][] m1, int[][] m2) {
        for (int row = 0; row < m1.length; row++) {
            for (int column = 0; column < m1[row].length; column++) {
                if (m1[row][column] != m2[row][column]) {
                    return false;
                }
            }
        }
        return true;
    }
}
