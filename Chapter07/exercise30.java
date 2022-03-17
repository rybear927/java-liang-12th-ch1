package Chapter07;
//(Pattern recognition: consecutive four equal numbers) Write the following method
//that tests whether the array has four consecutive numbers with the same value:
//public static boolean isConsecutiveFour(int[] values)
// Write a test program that prompts the user to enter a series of integers and displays it if the series contains four consecutive numbers with the same value. Your
//program should first prompt the user to enter the input size—i.e., the number of
//values in the series. Here are sample runs:

import java.util.Scanner;

public class exercise30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int arraySize = input.nextInt();
        int[] array = new int[arraySize];
        System.out.print("Enter the values: ");
        for (int i = 0; i < arraySize; i++) {
            array[i] = input.nextInt();
        }

        if (isConsecutiveFour(array)) {
            System.out.println("The list has consecutive fours");
        } else {
            System.out.println("The list does not have consecutive fours");
        }
    }

    public static boolean isConsecutiveFour(int[] values) {
        int counter = 0;
        int consecutiveValue = values[0];
        for (int i = 1; i < values.length; i++) {
            if (counter == 4) {
                return true;
            }

            if (consecutiveValue == values[i]) {
                counter++;
            } else {
                consecutiveValue = values[i];
            }
        }
        return false;
    }
}
