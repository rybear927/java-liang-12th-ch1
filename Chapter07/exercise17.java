package Chapter07;
//7 (Sort students) Write a program that prompts the user to enter the number of students,
// the students’ names, and their scores and prints student names in decreasing
//order of their scores. Assume the name is a string without spaces, use the Scanner’s next() method to read a name.

import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        String[] names = new String[numberOfStudents];
        int[] scores = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the name and score of a student (e.g. Jack 70): ");
            names[i] = input.next();
            scores[i] = input.nextInt();
        }

        sortScores(names, scores);
        System.out.println("Here's the list in descending order: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " " + scores[i]);

        }
    }

    public static void sortScores(String[] names, int[] scores) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < scores.length - 1; i++) {
                if (scores[i] < scores[i + 1]) {
                    //sort scores
                    int temp = scores[i];
                    scores[i] = scores[i + 1];
                    scores[i + 1] = temp;
                    //sort names
                    String temp2 = names[i];
                    names[i] = names[i + 1];
                    names[i + 1] = temp2;
                    unsorted = true;
                }
            }

        }
    }

    //helper methods that I will copy/paste to exercises for speeding up testing purposes
    public static void printArray(double[] array) {
        System.out.println("The array is: " + java.util.Arrays.toString(array));
    }

    public static void printArray(int[] array) {
        System.out.println("The array is: " + java.util.Arrays.toString(array));
    }

    public static void printArray(String[] array) {
        System.out.println("The array is: " + java.util.Arrays.toString(array));
    }


}
