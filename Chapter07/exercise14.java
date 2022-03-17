package Chapter07;
//7.14 (Computing lcm) Write a method that returns the lcm (least common multiple) of
//an unspecified number of integers. The method header is specified as follows:
//public static int lcm(int... numbers)
// Write a test program that prompts the user to enter five numbers, invokes the
//method to find the lcm of these numbers, and displays the lcm.

import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 integers: ");
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("The least common multiple of the numbers you entered is " + lcm(array));
    }

    public static int lcm(int... numbers) {
        int largestNumber = 0;
        for (int number : numbers) {
            if (largestNumber < number) {
                largestNumber = number;
            }
        }
        int counter = 2;
        boolean lcmFound = true;
        while (true) {
            for (int i = 0; i < 5; i++) {
                if (largestNumber % numbers[i] != 0) {
                    lcmFound = false;
                    break;
                }
            }
            if (lcmFound) {
                break;
            }
            largestNumber *= counter;
            counter++;
            lcmFound = true;
        }
        return largestNumber;
    }
}
