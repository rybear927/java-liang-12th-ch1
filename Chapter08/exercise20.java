package Chapter08;

import java.util.Scanner;

//(Game: connect four) Connect four is a two-player board game in which the
//players alternately drop colored disks into a seven-column, six-row vertically
//suspended grid, as shown below.
// The objective of the game is to connect four same-colored disks in a row, a column, or a diagonal before your opponent can do likewise. The program prompts
//two players to drop a red or yellow disk alternately. Whenever a disk is dropped,
//the program redisplays the board on the console and determines the status of the
//game (win, draw, or continue). Here is a sample run:
//| | | | | | | |
//| | | | | | | |
//| | | | | | | |
//| | | | | | | |
//| | | | | | | |
//| | | | | | | |
//
//Drop a red disk at column (0–6): 0
//| | | | | | | |
//| | | | | | | |
//| | | | | | | |
//| | | | | | | |
//| | | | | | | |
//|R| | | | | | |
public class exercise20 {
    //pre-game overview:
    //make board
    //print board
    //set gameover to false
    //while loop
    //let player choose where to drop disk
    //print board
    //if that player won, make a message and set gameover to true
    //repeat

    //post-game notes:
    //Took a little longer than I thought it would but still happy with the results.
    //Think there's probably a more efficient way to check for 4 in-a-row but ... not really sure the best approach
    //for that. One reason I left the board as an int board was that in the previous exercise they had you make
    //the checks for an int board, so I didn't wanna mess around with changing that, but if I had to start from
    //scratch again I think for ease of readability I'd do a char board
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //set up board
        int[][] board = new int[6][7];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = -1;
            }
        }
        //print board
        printBoard(board);

        //set gameover to false and set currentPlayer
        boolean gameOver = false;
        boolean currentPlayerIsRed = true;
        String currentPlayer = "red";

        //while loop
        while (!gameOver) {
            //let player choose where to drop disk
            System.out.print("Drop a " + currentPlayer + " disk at column (0-6): ");
            int column = input.nextInt();
            System.out.println();
            if (board[0][column] == -1) {
                dropDisk(column, currentPlayer, board);
            } else {
                System.out.println("This column is full. Choose another column.");
            }
            //print board
            printBoard(board);

            //if current player won, make a message and set gameover to true
            if (isConsecutiveFour(board)) {
                gameOver = true;
                System.out.println("The " + currentPlayer + " team won!");
            }

            //change player
            if (!gameOver) {
                currentPlayerIsRed = !currentPlayerIsRed;

                if (!currentPlayerIsRed) {
                    currentPlayer = "yellow";
                } else {
                    currentPlayer = "red";
                }
            }

        }
    }

    public static void dropDisk(int column, String currentPlayer, int[][] board) {
        //disk maintenance
        int disk = -1;
        if (currentPlayer.equals("red")) {
            disk = 0;
        } else {
            disk = 1;
        }

        //drop the disk on the bottom or on top of the top disk in that column
        if (board[board.length - 1][column] == -1) {
            board[board.length - 1][column] = disk;
        } else {
            for (int i = board.length - 2; i >= 0; i--) {
                if (board[i][column] == -1) {
                    board[i][column] = disk;
                    break;
                }
            }
        }
    }

    public static void printBoard(int[][] array) {
        char temp;
        System.out.println(" 0 1 2 3 4 5 6");
        for (int i = 0; i < array.length; i++) {
            System.out.print("|");
            for (int j = 0; j < array[i].length; j++) {
                switch (array[i][j]) {
                    case 0:
                        temp = 'R';
                        break;
                    case 1:
                        temp = 'Y';
                        break;
                    default:
                        temp = ' ';
                        break;
                }
                System.out.print(temp + "|");
            }
            System.out.println();
        }
        System.out.println("---------------");
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
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (values[i][j] != -1) {
                    if (foundHorizontal4(i, j, values) || foundDiagonal4(i, j, values) || foundVertical4(i, j, values)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
