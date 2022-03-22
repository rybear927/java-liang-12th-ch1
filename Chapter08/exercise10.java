package Chapter08;
//(Largest row and column) Write a program that randomly fills in 0s and 1s into
//a 5-by-5 matrix, prints the matrix, and finds the first row and column with the
//most 1s. Here is a sample run of the program:
//01101
//01011
//10010
//11111
//00101
//The largest row index: 3
//The largest column index: 4

public class exercise10 {
    public static void main(String[] args) {
        int[][] board = new int[5][5];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = (int) (Math.random() * 2);
            }
        }

        printBoard(board);
        System.out.println("Largest row index: " + getLargestRowIndex(board));
        System.out.println("Largest column index: " + getLargestColumnIndex(board));

    }

    public static int getLargestColumnIndex(int[][] board) {
        int largestColumnIndex = 0;
        int highestNumberOf1s = 0;
        int currentColumnNumberOf1s = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] == 1) {
                    currentColumnNumberOf1s++;
                }
            }
            if (currentColumnNumberOf1s > highestNumberOf1s) {
                largestColumnIndex = i;
                highestNumberOf1s = currentColumnNumberOf1s;
            }
            currentColumnNumberOf1s = 0;
        }
        return largestColumnIndex;
    }

    public static int getLargestRowIndex(int[][] board) {
        int largestRowIndex = 0;
        int highestNumberOf1s = 0;
        int currentRowNumberOf1s = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    currentRowNumberOf1s++;
                }
            }
            if (currentRowNumberOf1s > highestNumberOf1s) {
                largestRowIndex = i;
                highestNumberOf1s = currentRowNumberOf1s;
            }
            currentRowNumberOf1s = 0;
        }
        return largestRowIndex;
    }

    public static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
