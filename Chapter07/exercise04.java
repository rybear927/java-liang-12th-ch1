package Chapter07;
//(Analyze scores) Write a program that reads an unspecified number of scores and
//determines how many scores are above or equal to the average, and how many
//scores are below the average. Enter a negative number to signify the end of the
//input. Assume the maximum number of scores is 100.

import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numList = new int[100];
        int count = 0;
        int score;
        int sum = 0;
        do {
            System.out.print("Enter a score: ");
            score = input.nextInt();
            if (score > 0) {
                numList[count] = score;
                count++;
                sum += score;
            }
        } while (score > 0);

        double average = (double)sum / count;
        int aboveAverage = 0;
        int belowAverage = 0;
        for (int i = 0; i < count; i++) {
            if (numList[i] >= average) {
                aboveAverage++;
            } else {
                belowAverage++;
            }
        }

        System.out.println("Out of " + count + " score(s), " + aboveAverage + " were above average and " +
                belowAverage + " were below the average, with the average being " + average);
    }
}
