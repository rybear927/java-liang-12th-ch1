package Chapter08;
//(Even number of 1s) Write a program that generates a 6-by-6 two-dimensional
//matrix filled with 0s and 1s, displays the matrix, and checks if every row and
//every column have an even number of 1s.

public class exercise22 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }

        printArray(matrix);
        checkRows(matrix);
        checkColumns(matrix);

    }

    public static void checkColumns(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            columnHasEvenNumberOf1s(i, matrix);
        }
    }



    public static void checkRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            rowHasEvenNumberOf1s(i, matrix);
        }
    }

    public static boolean columnHasEvenNumberOf1s(int column, int[][] matrix) {
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][column] == 1) {
                counter++;
            }
        }
        if (counter % 2 == 0 && counter > 0) {
            System.out.println("Column " + column + " has an even number of 1s");
            return true;
        }
        return false;
    }

    public static boolean rowHasEvenNumberOf1s(int row, int[][] matrix) {
            int counter = 0;
        for (int i = 0; i < matrix[row].length; i++) {
            if (matrix[row][i] == 1) {
                counter++;
            }
        }
        if (counter % 2 == 0 && counter > 0) {
            System.out.println("Row " + row + " has an even number of 1s");
            return true;
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
