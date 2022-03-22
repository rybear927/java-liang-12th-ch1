package Chapter08;

import java.io.File;
import java.util.Scanner;

/*
(Latin square) A Latin square is an n-by-n array filled with n different Latin letters, each occurring exactly once in each row and once in each column. Write a
program that prompts the user to enter the number n and the array of characters,
as shown in the sample output, and checks if the input array is a Latin square.
The characters are the first n characters starting from A.
Enter number n: 4
Enter 4 rows of letters separated by spaces:
A B C D
B A D C
C D B A
D C A B
The input array is a Latin square
Enter number n: 3
Enter 3 rows of letters separated by spaces:
A F D
Wrong input: the letters must be from A to C
 */
public class exercise36 {
    public static void main(String[] args) throws Exception {
        File file = new File("chapter08/ex36input.txt");
        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            System.out.print("Enter number n");
            int n = input.nextInt();
            System.out.println();
            char[][] array = new char[n][n];
            System.out.print("Enter four rows of letters separated by spaces: ");
            System.out.println();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = input.next().charAt(0);
                    if (array[i][j] < 'A' || array[i][j] > 'A' + n - 1) {
                        System.out.println("Wrong input: the letters must be from A to " + (char) ('A' + n - 1));
                        System.exit(0);
                    }
                }
            }
            helperMethods.printArray(array);
            if (allRowsAndColumnsHaveUniqueCharacters(array)) {
                System.out.println("The input array is a Latin square");
            } else {
                System.out.println("The input array is not a Latin square");
            }
        }
        input.close();
    }

    public static boolean allRowsAndColumnsHaveUniqueCharacters(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (!rowHasUniqueCharacters(i, array) || !columnHasUniqueCharacters(i, array)) {
                return false;
            }
        }
        return true;
    }

    public static boolean columnHasUniqueCharacters(int column, char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i][column] == array[j][column]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean rowHasUniqueCharacters(int row, char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[row][i] == array[row][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
