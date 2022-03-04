package Chapter05;
//(Find the factors of an integer) Write a program that reads an integer and displays all its smallest
// factors in an increasing order. For example, if the input
//integer is 120, the output should be as follows: 2, 2, 2, 3, 5.

import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What's your integer?: ");
        int number = input.nextInt();
        int[] output = new int[100];
        int arraycounter = 0;

        int counter = 2;
        while (number != 1) {
            if (number % counter == 0) {
                number /= counter;
                output[arraycounter] = counter;
                arraycounter++;
                counter = 2;
            } else {
                counter++;
            }
        }

        for (int i = 0; i < arraycounter - 1; i++) {
            System.out.print(output[i] + ", ");
        }
        System.out.print(output[arraycounter - 1]);
    }
}
