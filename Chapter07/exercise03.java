package Chapter07;
//(Count occurrence of numbers) Write a program that reads the integers between 1
//and 50 and counts the occurrences of each. Assume the input ends with 0. Here is
//a sample run of the program.
//Enter the integers between 1 and 50: 2 5 6 5 4 3 23 43 2 0
//2 occurs 2 times
//3 occurs 1 time
//4 occurs 1 time
//5 occurs 2 times
//6 occurs 1 time
//23 occurs 1 time
//43 occurs 1 time

import java.util.Arrays;
import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 50: ");
        int[] intArray = new int[51];
        while (true) {
            int temp = input.nextInt();
            if (temp == 0) {
                break;
            }
            intArray[temp]++;
        }

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] != 0) {
                if (intArray[i] == 1) {
                    System.out.println(i + " occurs " + intArray[i] + " time");
                } else {
                    System.out.println(i + " occurs " + intArray[i] + " times");
                }
            }

        }
    }
}
