package Chapter03;
//(Game: heads or tails) Write a program that lets the user guess whether the flip
//of a coin results in heads or tails. The program randomly generates an integer
//0 or 1, which represents head or tail. The program prompts the user to enter a
//guess, and reports whether the guess is correct or incorrect.

import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a guess. 0 for heads and 1 for tails: " );
        int guess = input.nextInt();

        int computerAnswer = (int)(Math.random() * 2);

        if (computerAnswer == 0 && guess == 0) {
            System.out.println("You guessed heads and the computer guessed heads!");
        } else if (computerAnswer == 1 && guess == 1) {
            System.out.println("You guessed tails and the computer guessed tails!");
        } else if (computerAnswer == 0 && guess == 1) {
            System.out.println("You guessed tails but the computer guessed heads :(");
        } else {
            System.out.println("You guessed heads but the computer guessed tails :(");
        }

    }



}
