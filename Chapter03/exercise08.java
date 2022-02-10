package Chapter03;
//(Sort three integers) Write a program that prompts the user to enter three integers
//and display the integers in non-decreasing order.

import java.util.Scanner;

public class exercise08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three integers and they will be sorted in ascending order: ");
        int digit1 = input.nextInt();
        int digit2 = input.nextInt();
        int digit3 = input.nextInt();

        while (digit1 > digit3 || digit1 > digit2) {
            if (digit1 > digit2) {
                int temp = digit1;
                digit1 = digit2;
                digit2 = temp;
                ;
            }
            if (digit2 > digit3) {
                int temp = digit2;
                digit2 = digit3;
                digit3 = temp;
            }
        }

        System.out.printf("The digits are : " + digit1 + ", " + digit2 + ", and " + digit3);
    }

}
