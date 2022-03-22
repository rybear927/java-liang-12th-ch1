package Chapter08;
//(Game: nine heads and tails) Nine coins are placed in a 3-by-3 matrix with some
//face up and some face down. You can represent the state of the coins using a
//3-by-3 matrix with values 0 (heads) and 1 (tails). Here are some examples:
//0 0 0 1 0 1 1 1 0 1 0 1 1 0 0
//0 1 0 0 0 1 1 0 0 1 1 0 1 1 1
//0 0 0 1 0 0 0 0 1 1 0 0 1 1 0
// Each state can also be represented using a binary number. For example, the preceding matrices correspond to the numbers
//000010000 101001100 110100001 101110100 100111110
// There are a total of 512 possibilities, so you can use decimal numbers 0, 1, 2, 3, . . . ,
//and 511 to represent all states of the matrix. Write a program that prompts the
//user to enter a number between 0 and 511 and displays the corresponding matrix
//with the characters H and T. In the following sample run, the user entered 7, which
//corresponds to 000000111. Since 0 stands for H and 1 for T, the output is correct.

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        printStringAsHeadsAndTails(getBinary(input.nextInt()));

    }

    public static void printStringAsHeadsAndTails(String binaryNumber) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (binaryNumber.charAt(j + (3 * i)) == '0') { //sooo...the 3 * i is maybe confusing, sorry
                    System.out.print("H ");
                } else {
                    System.out.print("T ");
                }
            }
            System.out.println();
        }
    }

    public static String getBinary(int number) {
        String numberString = "";
        for (int i = 8; i >= 0 ; i--) {
            if (number / (int)(Math.pow(2, i)) > 0) {
                numberString += "1";
                number -= (int)(Math.pow(2, i));
            } else {
                numberString += "0";
            }
        }
        return numberString;
    }
}
