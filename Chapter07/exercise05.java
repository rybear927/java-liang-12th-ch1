package Chapter07;
//(The number of even numbers and odd numbers) Write a program that reads ten integers,
// and then display the number of even numbers and odd numbers. Assume that
//the input ends with 0. Here is the sample run of the program:
//Enter numbers: 1 2 3 2 1 6 3 4 5 2 3 6 8 9 9 0
//The number of odd numbers: 8
//The number of even numbers: 7

import java.util.Scanner;

public class exercise05 {
    //note: the wording on this is so damn confusing. I'm just gonna build it how I'm guessing they
    //were asking for (e.g. read ten integers, state the number of odds and evens)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArray = new int[10];
        int oddNumbers = 0;
        int evenNumbers = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter an integer: ");
            numArray[i] = input.nextInt();
            if (numArray[i] % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
        }

        System.out.println("The number of odd numbers: " + oddNumbers);
        System.out.println("The number of even numbers: " + evenNumbers);
    }
}
