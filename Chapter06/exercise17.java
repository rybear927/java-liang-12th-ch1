package Chapter06;
//(Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix
//using the following header: Here is a sample run:
//public static int printMatrix(int year)
//that prompts the user to enter n and displays an n-by-n matrix. Here is a sample
//run:
//Enter n: 3
//0 1 0
//0 0 0
//1 1 1
//public static void printMatrix(int n)
//Each element is 0 or 1, which is generated randomly. Write a test program that
//prompts the user to enter n and displays an n-by-n matrix.

import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        printMatrix(input.nextInt());
    }

    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((int)(Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }
}
