package Chapter03;
//(Even or odd number) Write a program that prompts the user to enter an integer
//and displays whether the integer is an odd number or not. Here are the sample
//runs:
//Enter an integer: 200
//200 is even number

import java.util.Scanner;

public class exercise35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
    }
}
