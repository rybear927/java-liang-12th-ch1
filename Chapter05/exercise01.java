package Chapter05;
//(Pass or fail) Write a program that prompts a student to enter a Java score.
//If the score is greater or equal to 60, display “you pass the exam”; otherwise,
//display “you don’t pass the exam”. Your program ends with input −1. Here is a
//sample run:
//read and think before coding
//explore solutions
//Enter your score: 80
//You pass the exam
//Enter your score: 59
//You don’t pass the exam
//Enter your score: −1

import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args) {
        int score = -5;
        Scanner input = new Scanner(System.in);

        while (score != -1) {
            System.out.print("Enter your score: ");
            score = input.nextInt();

            if (score == -1) {
                break;
            } else if (score >= 60) {
                System.out.println("You pass the exam.");
            } else {
                System.out.println("You don't pass the exam.");
            }

        }
    }
}
