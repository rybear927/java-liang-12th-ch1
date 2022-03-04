package Chapter05;
//(Occurrence of max numbers) Write a program that reads integers, finds the largest of them, and counts its occurrences. Assume the input ends with number 0.
//Suppose you entered 3 5 2 5 5 5 0; the program finds that the largest is 5 and
//the occurrence count for 5 is 4. If no input is entered, display "No numbers are
//entered except 0".
//(Hint: Maintain two variables, max and count. max stores the current max
//number and count stores its occurrences. Initially, assign the first number to
//max and 1 to count. Compare each subsequent number with max. If the number is greater than max, assign it to max and reset count to 1. If the number is
//equal to max, increment count by 1.)
//Enter numbers: 3 5 2 5 5 5 0
//The largest number is 5
//The occurrence count of the largest number is 4

import java.util.Scanner;


//note: there's a different way to deal with the inputs but I wasn't sure if they wanted the input looped
//or just to have the user submit a string and then loop through the string.
public class exercise41 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a bunch of integers (use 0 to quit): ");

        int max = 0;
        int countOfMax = 0;
        while (true) {
            int userNumber = input.nextInt();
            if (userNumber == 0) {
                break;
            } else if (userNumber > max) {
                max = userNumber;
                countOfMax = 1;
            } else if (userNumber == max) {
                countOfMax++;
            }

        }

        System.out.println("The max number was " + max + " and it was entered " + countOfMax + " time(s).");
    }
}
