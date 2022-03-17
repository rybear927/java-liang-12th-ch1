package Chapter07;
//(Find the largest element) Write a method that finds the largest element in an array
//of double values using the following header:
//public static double max(double[] array)
// Write a test program that prompts the user to enter ten numbers, invokes this
//method to return the maximum value, and displays the maximum value. Here is
//a sample run of the program:
//Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
//The minimum number is: 6

import java.util.Scanner;

public class exercise09 {
    //damn there are a lot of typos in this book. Way worse than the other editions.
    //I'm just gonna find the max number, even though the example says min
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];
        double max = 0;
        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("The maximum number is " + max);


    }
}
