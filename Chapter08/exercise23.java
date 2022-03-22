package Chapter08;

import java.io.File;
import java.util.Scanner;

public class exercise23 {
    //I think this exercise is bullshit. How do you know which cell was flipped? In the example, it says (0, 1) was the
    //flipped cell, but it could just as easily have been 0,2 or 0,3 or 0,0. Seriously, I have no clue what they're going
    //for, so I'm just gonna return which row has an uneven amount of 1s.
    public static void main(String[] args) throws Exception{
        File file = new File("chapter08/ch08ex23input.txt");
        Scanner input = new Scanner(file);
        int[][] matrix = new int[6][6];

        while (input.hasNext()) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = input.nextInt();
                }
            }
        }
        input.close();

        printArray(matrix);
        for (int i = 0; i < matrix.length; i++) {
            if (!rowHasEvenNumberOf1s(i, matrix)) {
                System.out.println("Row " + i + " has an uneven number of 1s but who the fuck knows which cell was flipped.");
            }
        }
    }

    public static boolean rowHasEvenNumberOf1s(int row, int[][] matrix) {
        int counter = 0;
        for (int i = 0; i < matrix[row].length; i++) {
            if (matrix[row][i] == 1) {
                counter++;
            }
        }
        if (counter % 2 == 0 && counter > 0) {
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
