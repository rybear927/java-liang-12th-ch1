package Chapter07;
//(Reverse the numbers entered) Write a program that reads 10 integers then displays
// them in the reverse of the order in which they were read.

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {

        //input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = input.nextInt();
        }

        //output
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.print(intArray[i] + " ");
        }
    }
}
