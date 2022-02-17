package Chapter04;
//(Convert letter grade to number) Write a program that prompts the user to enter
//a letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3,
//2, 1, or 0. For other input, display invalid grade. Here is a sample run:
//Enter a letter grade: B
//The numeric value for grade B is 3
//Enter a letter grade: T
//T is an invalid grade

import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        char grade = input.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("The numeric value for grade " + grade + " is 4");
                break;
            case 'B':
                System.out.println("The numeric value for grade " + grade + " is 3");
                break;
            case 'C':
                System.out.println("The numeric value for grade " + grade + " is 2");
                break;
            case 'D':
                System.out.println("The numeric value for grade " + grade + " is 1");
                break;
            case 'F':
                System.out.println("The numeric value for grade " + grade + " is 0");
                break;
            default:
                System.out.println(grade + " is an invalid grade");
                break;
        }
    }
}
