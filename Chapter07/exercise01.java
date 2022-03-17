package Chapter07;
//(Assign grades) Write a program that reads student scores, gets the best score, and
//then assigns grades based on the following scheme:
//Grade is A if score is Ú best -5;
//Grade is B if score is Ú best -10;
//Grade is C if score is Ú best -15;
//Grade is D if score is Ú best -20;
//Grade is F otherwise.
// The program prompts the user to enter the total number of students, and then
//prompts the user to enter all of the scores, and concludes by displaying the grades.
//Here is a sample run:
//Enter the number of students: 4
//Enter 4 scores: 40 55 70 58
//Student 0 score is 40 and grade is F
//Student 1 score is 55 and grade is C
//Student 2 score is 70 and grade is A
//Student 3 score is 58 and grade is C

import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        int[] scores = new int[numberOfStudents];
        System.out.print("Enter " + numberOfStudents + " scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }

        int bestScore = 0;

        //find the best score
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > bestScore) {
                bestScore = scores[i];
            }
        }

        //print results
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + getGrade(scores[i], bestScore));
        }

    }

    public static char getGrade(int score, int bestScore) {
        if (score >= bestScore - 5) {
            return 'A';
        } else if (score >= bestScore - 10) {
            return 'B';
        } else if (score >= bestScore - 15) {
            return 'C';
        } else if (score >= bestScore - 20) {
            return 'D';
        }
        return 'F';
    }
}
