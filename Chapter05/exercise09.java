package Chapter05;
//(Find the two lowest scores) Write a program that prompts the user to enter the
//number of students and each student’s name and score, and finally displays the
//names of the students with the lowest and second-lowest scores.

import java.util.Scanner;

public class exercise09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lowestScore = -1;
        int secondLowestScore = 0;
        String studentWithLowestScore = "";
        String studentWithSecondLowestScore = "";

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter a student's name: ");
            String name = input.next();
            System.out.print("Enter their score: ");
            int score = input.nextInt();
            if (i == 0) {
                lowestScore = score;
                studentWithLowestScore = name;
            }
            if (i == 1) {
                if (lowestScore < score) {
                    secondLowestScore = score;
                    studentWithSecondLowestScore = name;
                }
            }
            if (lowestScore > score) {
                secondLowestScore = lowestScore;
                studentWithSecondLowestScore = studentWithLowestScore;
                lowestScore = score;
                studentWithLowestScore = name;
            } else if (secondLowestScore > score) {
                secondLowestScore = score;
                studentWithSecondLowestScore = name;
            }
        }

        System.out.println("The student with the lowest score is " + studentWithLowestScore + " with a score of " +
                lowestScore);
        System.out.println("The student with the second lowest score is " + studentWithSecondLowestScore + " with a score of " +
                secondLowestScore);
    }
}
