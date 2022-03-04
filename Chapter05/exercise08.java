package Chapter05;
//(Find the highest score) Write a program that prompts the user to enter the number of students and each student’s name
// and score, and finally displays the name
//of the student with the highest score. Use the next() method in the Scanner
//class to read a name, rather than using the nextLine() method. Assume that the
//number of students is at least 1.

import java.util.Scanner;

public class exercise08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int highestScore = -1;
        String studentWithHighestScore = "";

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter a student's name: ");
            String name = input.next();
            System.out.print("Enter their score: ");
            int score = input.nextInt();
            if (score > highestScore) {
                highestScore = score;
                studentWithHighestScore = name;
            }
        }

        System.out.println("The student with the highest score is " + studentWithHighestScore + " with a score of " +
                highestScore);
    }
}
