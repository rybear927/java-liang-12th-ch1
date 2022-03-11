package Chapter06;
//(Sort three numbers) Write a method with the following header to display three
//numbers in decreasing order:
//public static void displaySortedNumbers(
// double num1, double num2, double num3)
//Write a test program that prompts the user to enter three numbers and invokes the
//method to display them in decreasing order.

import java.util.Arrays;
import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        displaySortedNumbers(num1, num2, num3);


    }

    public static void displaySortedNumbers(int num1, int num2, int num3) {
        int[] numberArray = new int[3];
        numberArray[0] = num1;
        numberArray[1] = num2;
        numberArray[2] = num3;

        Arrays.sort(numberArray);

        for (int number :
                numberArray) {
            System.out.println(number);
        }
    }
}
