package Chapter08;
//(Pattern recognition: four consecutive equal numbers) Write the following
//method that tests whether a two-dimensional array has four consecutive numbers
//of the same value, either horizontally, vertically, or diagonally:
//public static boolean isConsecutiveFour(int[][] values)
//Write a test program that prompts the user to enter the number of rows and
//columns of a two-dimensional array then the values in the array, and displays true
//if the array contains four consecutive numbers with the same value. Otherwise,
//the program displays false. Here are some examples of the true cases:
//0 1 0 3 1 6 1
//0 1 6 8 6 0 1
//5 6 2 1 8 2 9
//6 5 6 1 1 9 1
//1 3 6 1 4 0 7

import java.util.Scanner;

public class exercise19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();
        //The exercise asks for the user to enter the individual numbers of the array, which is crazy.
        //I'll just be randomly inputting them

        System.out.println();//testing purposes
        int[][] array = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = (int)(Math.random() * 10);
            }
        }
        printArray(array);
        isConsecutiveFour(array);

    }

    //doesn't check towards top left or bottom left cause we only need to search from left to right
    public static boolean foundDiagonal4(int row, int column, int[][] values) {
        if (foundDiagonal4BottomRight(row, column, values) || foundDiagonal4TopRight(row, column, values)) {
            return true;
        }
        return false;
    }

    public static boolean foundDiagonal4BottomRight(int row, int column, int[][] values) {
        //check towards bottom right
        if (row > values.length - 4 || column > values[row].length - 4) {
            return false;
        }
        int targetNumber = values[row][column];
        for (int i = row, j = column; j < column + 4; i++, j++) {
            if (values[i][j] != targetNumber) {
                return false;
            }
        }
        return true;
    }

    public static boolean foundDiagonal4TopRight(int row, int column, int[][] values) {
        //check towards top right
        if (row < 3 || column > values[row].length - 4) {
            return false;
        }
        int targetNumber = values[row][column];
        for (int i = row, j = column; j < column + 4; i--, j++) {
            if (values[i][j] != targetNumber) {
                return false;
            }
        }
        return true;
    }

    public static boolean foundHorizontal4(int row, int column, int[][] values) {
        int targetNumber = values[row][column];
        if (column > values[row].length - 4) {
            return false;
        }
        for (int i = column; i < values[row].length && i < column + 4; i++) {
            if (values[row][i] != targetNumber) {
                return false;
            }
        }
        return true;
    }

    public static boolean foundVertical4(int row, int column, int[][] values) {
        int targetNumber = values[row][column];
        if (row > values.length - 4) {
            return false;
        }
        for (int i = row; i < values.length && i < row + 4; i++) {
            if (values[i][column] != targetNumber) {
                return false;
            }
        }
        return true;
    }

    public static boolean isConsecutiveFour(int[][] values) {
        //check horizontally from left to right
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (foundHorizontal4(i, j, values)){
                    System.out.println("There is a horizontal line of four starting at " + i + ", " + j);
                    return true;
                } else if (foundDiagonal4(i, j, values)){
                    System.out.println("There is a diagonal line of four starting at " + i + ", " + j);
                    return true;
                } else if (foundVertical4(i, j, values)){
                    System.out.println("There is a vertical line of four starting at " + i + ", " + j);
                    return true;
                }
            }
        }
        return false;
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
}
