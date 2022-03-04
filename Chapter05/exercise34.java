package Chapter05;
//(Game: scissor, rock, paper) Programming Exercise 3.17 gives a program that
//plays the scissor-rock-paper game. Revise the program to let the user continuously play until either the user or the computer wins three times more than their
//opponent.


import java.util.Scanner;

public class exercise34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computerWins = 0;
        int humanWins = 0;

        while (true) {
            System.out.print("scissor (0), rock (1), paper (2): ");
            int guess = input.nextInt();
            int computerGuess = 0; //(int)(Math.random() * 3);

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
                System.out.println(" You lost.");
                computerWins++;
            } else if (guess == 0 && computerGuess == 2) {
                System.out.println(" You won.");
                humanWins++;
            } else if (guess == 1 && computerGuess == 2) {
                System.out.println(" You lost.");
                computerWins++;
            } else if (guess == 1 && computerGuess == 0) {
                System.out.println(" You won.");
                humanWins++;
            } else if (guess == 2 && computerGuess == 0) {
                System.out.println(" You lost.");
                computerWins++;
            } else if (guess == 2 && computerGuess == 1) {
                System.out.println(" You won.");
                humanWins++;
            }
            System.out.println("Computer wins: " + computerWins);
            System.out.println("Human wins: " + humanWins);
            if (computerWins != 0 && humanWins != 0) {
                if (computerWins / 3 == humanWins) {
                    System.out.println("The computer has won 3 times more than you, doofus.");
                    break;
                } else if (humanWins / 3 == computerWins) {
                    System.out.println("You've won 3 times more than the computer.");
                    break;
                }
            }
        }
    }
}
