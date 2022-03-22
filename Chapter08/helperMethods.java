package Chapter08;

import java.io.File;
import java.util.Scanner;

public class helperMethods {
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

        //read from a file
        //put this after main: throws Exception{
            File file = new File(".txt");
            //Scanner input = new Scanner(file);
            while (input.hasNext()) {
                        int employees = input.nextInt();
            }
            input.close();
    }

    //bubble sort decreasing order by row first and then column
    public static void bubbleSortByRowAndColumn(int[][] array) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i][0] < array[i + 1][0]) {
                    int temp = array[i][0];
                    array[i][0] = array[i + 1][0];
                    array[i + 1][0] = temp;
                    temp = array[i][1];
                    array[i][1] = array[i + 1][1];
                    array[i + 1][1] = temp;
                    unsorted = true;
                } else if (array[i][0] == array[i + 1][0] && array[i][1] < array[i + 1][1]) {
                    int temp = array[i][0];
                    array[i][0] = array[i + 1][0];
                    array[i + 1][0] = temp;
                    temp = array[i][1];
                    array[i][1] = array[i + 1][1];
                    array[i + 1][1] = temp;
                    unsorted = true;
                }
            }
        }
    }

    public static int[][] getBubbleSortByRowAndColumn(int[][] originalArray) {
        int[][] array = new int[originalArray.length][originalArray[0].length];
        for (int i = 0; i < originalArray.length; i++) {
            for (int j = 0; j < originalArray[i].length; j++) {
                array[i][j] = originalArray[i][j];
            }
        }
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i][0] < array[i + 1][0]) {
                    int temp = array[i][0];
                    array[i][0] = array[i + 1][0];
                    array[i + 1][0] = temp;
                    temp = array[i][1];
                    array[i][1] = array[i + 1][1];
                    array[i + 1][1] = temp;
                    unsorted = true;
                } else if (array[i][0] == array[i + 1][0] && array[i][1] < array[i + 1][1]) {
                    int temp = array[i][0];
                    array[i][0] = array[i + 1][0];
                    array[i + 1][0] = temp;
                    temp = array[i][1];
                    array[i][1] = array[i + 1][1];
                    array[i + 1][1] = temp;
                    unsorted = true;
                }
            }
        }
        return array;
    }

    //bubble sort decreasing order by column 1
    public static void bubbleSortByColumn(int[][] array) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i][1] < array[i + 1][1]) {
                    int temp = array[i][0];
                    array[i][0] = array[i + 1][0];
                    array[i + 1][0] = temp;
                    temp = array[i][1];
                    array[i][1] = array[i + 1][1];
                    array[i + 1][1] = temp;
                    unsorted = true;
                }
            }
        }
    }

    //print with one space between each number
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    //print with one space between each number
    public static void printArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    //print with one space between each number
    public static void printArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    //print with one space between each number
    public static void printArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
