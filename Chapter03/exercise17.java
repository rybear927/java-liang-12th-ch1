package Chapter03;
//(Game: scissor, rock, paper) Write a program that plays the popular scissor–
//rock–paper game. (A scissor can cut a paper, a rock can knock a scissor, and
//a paper can wrap a rock.) The program randomly generates a number 0, 1, or
//2 representing scissor, rock, and paper. The program prompts the user to enter
//a number 0, 1, or 2 and displays a message indicating whether the user or the
//computer wins, loses, or draws. Here are sample runs:
//scissor (0), rock (1), paper (2): 1
//The computer is scissor. You are rock. You won
//scissor (0), rock (1), paper (2): 2
//The computer is paper. You are paper too. It is a draw

import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int guess = input.nextInt();
        int computerGuess = (int)(Math.random() * 3);

        switch (computerGuess) {
            case 0:
                System.out.print("The computer is scissors. ");
                break;
            case 1:
                System.out.print("The computer is rock. ");
                break;
            case 2:
                System.out.print("The computer is paper. ");
        }

        switch (guess) {
            case 0:
                System.out.print("You are scissors");
                break;
            case 1:
                System.out.print("You are rock");
                break;
            case 2:
                System.out.print("You are paper");
                break;
        }

        if (guess == computerGuess) {
            System.out.print(" too. It is a draw.");
        } else {
            System.out.print(".");
        }

        if (guess == 0 && computerGuess == 1) {
            System.out.print(" You lost.");
        } else if (guess == 0 && computerGuess == 2) {
            System.out.print(" You won.");
        } else if (guess == 1 && computerGuess == 2) {
            System.out.print(" You lost.");
        } else if (guess == 1 && computerGuess == 0) {
            System.out.print(" You won.");
        } else if (guess == 2 && computerGuess == 0) {
            System.out.print(" You lost.");
        } else if (guess == 2 && computerGuess == 1) {
            System.out.print(" You won.");
        }


    }
}
