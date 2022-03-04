package Chapter05;
//(Display pyramid) Write a program that prompts the user to enter an integer from
//1 to 15 and displays a pyramid, as shown in the following sample run:
//Enter the number of lines: 7
//7 6 5 4 3 2 1 2 3 4 5 6 7
//6 5 4 3 2 1 2 3 4 5 6
//5 4 3 2 1 2 3 4 5
//4 3 2 1 2 3 4
//3 2 1 2 3
//2 1 2
//1

import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int number = input.nextInt();
        int counter = number;

        for (int i = number; i > 0; i--) {
            while (counter != 0) {
                System.out.print(counter + " ");
                counter--;
            }
            counter += 2;
            while (counter <= number) {
                System.out.print(counter + " ");
                counter++;
            }
            number--;
            counter = number;
            System.out.println();
        }




    }
}
