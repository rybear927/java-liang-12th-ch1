package Chapter05;
//5 (Statistics: compute mean and standard deviation) In business applications, you
//are often asked to compute the mean and standard deviation of data. The mean is
//simply the average of the numbers. The standard deviation is a statistic that tells
//you how tightly all the various data are clustered around the mean in a set of data.
//For example, what is the average age of the students in a class? How close are the
//ages? If all the students are the same age, the deviation is 0.
//Write a program that prompts the user to enter 10 numbers and displays the
//mean and standard deviations of these numbers using the following formula:
//mean =
//a
//n
//i=1
//xi
//n = x1 + x2 + g + xn
//n deviation = c
//a
//n
//i=1
//xi
//2 -
//a a
//n
//i=1
//xib
//2
//n
//n - 1
//Here is a sample run:
//Enter 10 numbers: 1 2 3 4.5 5.6 6 7 8 9 10
//The mean is 5.61
//The standard deviation is 2.99794

import java.util.Scanner;

public class exercise45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mean = 0;
        double sum = 0;
        double deviation = 0.0;

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            double temp = input.nextDouble();
            sum += temp;
            deviation += Math.pow(temp, 2);
        }
        mean = sum / 10;
        deviation = deviation - (Math.pow(sum, 2) / 10);
        deviation = deviation / (10 - 1);
        deviation = Math.sqrt(deviation);

        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + deviation);;

//        String currentNumber = numbers.substring(0, numbers.indexOf(' '));
//        numbers = numbers.substring(currentNumber.length());
//        System.out.println(currentNumber);


//        int[] numberList = new int[10];
//        for (int i = 0; i < 10; i++) {
//            String currentNumber = numbers.substring(0, numbers.indexOf(' '));
//            numbers = numbers.substring(currentNumber.length());
//            System.out.println(currentNumber);
//        }
    }
}
