package Chapter07;
//(Game: Eight Queens) The classic Eight Queens puzzle is to place eight queens on a
//chessboard such that no two queens can attack each other (i.e., no two queens are on
//the same row, same column, or same diagonal). There are many possible solutions.
//Write a program that displays one such solution. A sample output is shown below:
//|Q| | | | | | | |
//| | | | |Q| | | |
//| | | | | | | |Q|
//| | | | | |Q| | |
//| | |Q| | | | | |
//| | | | | | |Q| |
//| |Q| | | | | | |
//| | | |Q| | | | |

public class exercise36 {
    //note: so what's supposed to happen is that it looks at the queens before and sees if there's a problem.
    //If there's a problem, it moves the current queen forward by one.
    //If the current queen hits the end of the row, then it moves it back off the board and moves the previous queen
    //forward by one, and then continues moving the current queen forward by one and checking. That's what's supposed to happen.
    //What really happens is it ends up moving the previous queen all the way to the end of the row. But somehow that still works
    //and I'm still happy that at least I found an answer.
    public static void main(String[] args) {
        int[] array = {-1, -1, -1, -1, -1, -1, -1, -1};

        for (int i = 0; i < 8; i++) {
            placeAQueen(i, array);

        }
        printBoard(array);

    }

    public static void placeAQueen(int position, int[] array) {
         do {
            //ok, so one option is instead of having it call itself, I could have it call a method
             //that just moves the previous queen. Is that better? No clue.

            array[position] += 1;
            if (array[position] == 8) {
                array[position] = -1;
                placeAQueen(position - 1, array);
            }
            printBoard(array);
        } while (hasConflict(position, array) || array[position] == -1);

    }

    public static void printBoard(int[] array) {
        for (int i = 0; i < array.length; i++) {
            //print vertical line at start of every line
            System.out.print(i + "|");
            for (int j = 0; j < array[i]; j++) {
                System.out.print(" |");
            }

            //Print a Q if it's not -1
            if (array[i] != -1) {
                System.out.print("Q|");
            }

            //Print the empty spaces after the Q in that line
            for (int j = array[i] + 1; j < array.length; j++) {
                System.out.print(" |");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean hasConflict(int position, int[] array) {
        if (hasDiagonalConflict(position, array) || hasVerticalConflict(position, array) || hasHorizontalConflict(position, array)) {
            return true;
        }
        return false;
    }

    public static boolean hasVerticalConflict(int position, int[] array) {
        //if no queen has been assigned to this position, return false
        if (array[position] == -1) {
            return false;
        }
        //checks the elements before position
        for (int i = 0; i < position; i++) {
            if (array[i] == array[position]) {
                return true;
            }
        }
        //checks the elements after position
        for (int i = position + 1; i < array.length; i++) {
            if (array[i] == array[position]) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasHorizontalConflict(int position, int[] array) {
        //since it's impossible to fit two numbers into the same array location, this is false by default
        return false;
    }

    public static boolean hasDiagonalConflict(int position, int[] array) {
        //check from position to top left
        for (int i = position - 1; i >= 0; i--) {
            //the numerical relation for a diagonal line going to the top left is
            //i - array[i]
            if (array[i] != -1 && i - array[i] == position - array[position]) {
                return true;
            }
        }

        //check from position to top right
        for (int i = position - 1; i >= 0; i--) {
            //numerical relation here is array[i] + i
            if (array[i] != -1 && array[i] + i == array[position] + position) {
                return true;
            }
        }

        //check from position to bottom left
        for (int i = position + 1; i < array.length; i++) {
            //numerical relation here is array[i] + i
            if (array[i] != -1 && array[i] + i == array[position] + position) {
                return true;
            }
        }

        //check from position to bottom right
        for (int i = position + 1; i < array.length; i++) {
            //numerical relation here is array[i] + i
            if (array[i] != -1 && i - array[i] == position - array[position]) {
                return true;
            }
        }
        return false;
    }
}
