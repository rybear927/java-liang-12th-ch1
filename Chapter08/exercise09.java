package Chapter08;

import java.util.Scanner;

//(Game: play a tic-tac-toe game) In a game of tic-tac-toe, two players take turns
//marking an available cell in a 3 * 3 grid with their respective tokens (either X
//or O). When one player has placed three tokens in a horizontal, vertical, or diagonal row on the grid, the game is over and that player has won. A draw (no winner)
//occurs when all the cells on the grid have been filled with tokens and neither
//player has achieved a win. Create a program for playing a tic-tac-toe game.
// The program prompts two players to alternately enter an X token and O token.
//Whenever a token is entered, the program redisplays the board on the console and
//determines the status of the game (win, draw, or continue). Here is a sample run:

public class exercise09 {
    //pregame notes:
    //while game not over or not a draw
    //print board
    //ask player x/o to input a row
    //ask player x/o to input a column
    //check for win conditions
    //did current player win?
    //is it a draw?
    //repeat
    public static void main(String[] args) {
        //note: I'm happy with how this came out. Feels more efficient than last time...maybe
        Scanner input = new Scanner(System.in);
        boolean gameOver = false;
        boolean currentPlayerIsX = true;

        //create an empty board
        char[][] board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
        printBoard(board);

        //game loop
        while (!gameOver) {
            //input
            System.out.print("Enter a row (0, 1, or 2) for player " + getCurrentPlayer(currentPlayerIsX) + ": ");
            int row = input.nextInt();
            System.out.print("Enter a column (0, 1, or 2) for player " + getCurrentPlayer(currentPlayerIsX) + ": ");
            int column = input.nextInt();


            if (board[row][column] != ' ') { //check that the space is open
                System.out.println("That space is already occupied. Please input again.");
            } else { //put the piece on the board and check if someone won or if there's a draw
                board[row][column] = getCurrentPlayer(currentPlayerIsX);
                printBoard(board);
                if (somebodyWon(board, getCurrentPlayer(currentPlayerIsX))) {
                    gameOver = true;
                    System.out.println(getCurrentPlayer(currentPlayerIsX) + " is the winner!");
                } else if (noSpacesLeft(board)) {
                    gameOver = true;
                    System.out.println("It's a draw.");
                }
                currentPlayerIsX = !currentPlayerIsX;
            }

        }

    }

    public static boolean noSpacesLeft(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean somebodyWon(char[][] board, char player) {
        int counter = 0;

        //check horizontals
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == player) {
                    counter++;
                }
            }
            if (counter == 3) {
                return true;
            } else {
                counter = 0;
            }
        }

        //check verticals
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[j][i] == player) {
                    counter++;
                }
            }
            if (counter == 3) {
                return true;
            } else {
                counter = 0;
            }
        }

        //check diagonal (top left to bottom right)
        for (int i = 0; i < 3; i++) {
            if (board[i][i] == player) {
                counter++;
            }
        }
        if (counter == 3) {
            return true;
        } else {
            counter = 0;
        }

        //check diagonal (top right to bottom left)
        for (int i = 0, j = 2; i < 3; i++, j--) {
            if (board[i][j] == player) {
                counter++;
            }
        }
        if (counter == 3) {
            return true;
        }
        return false;
    }

    public static char getCurrentPlayer(boolean currentPlayerIsX) {
        if (currentPlayerIsX) {
            return 'X';
        }
        return 'O';
    }

    public static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < board.length; i++) {
            System.out.print("|");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(" " + board[i][j] + " |");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}
