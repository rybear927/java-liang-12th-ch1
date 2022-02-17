package Chapter03;
//(Use the &&, ||, and ^ operators) Write a program that prompts the user to
//enter an integer and determines whether it is divisible by 4 and 5, whether it is
//divisible by 4 or 5, and whether it is divisible by 4 or 5 but not both. Here is a
//sample run of this program:
//Enter an integer: 10
//Is 10 divisible by 4 and 5? false
//Is 10 divisible by 4 or 5? true
//Is 10 divisible by 4 or 5 but not both? true

import java.util.Scanner;

public class exercise26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        boolean divisibleBy4 = number % 4 == 0 ? true : false;
        boolean divisibleBy5 = number % 5 == 0 ? true : false;

        System.out.println("Is " + number + " divisible by 4 and 5? " + (divisibleBy4 && divisibleBy5));
        System.out.println("Is " + number + " divisible by 4 or 5? " + (divisibleBy4 || divisibleBy5));
        System.out.println("Is " + number + " divisible by 4 or 5 but not both? " + (divisibleBy4 ^ divisibleBy5));

    }
}
