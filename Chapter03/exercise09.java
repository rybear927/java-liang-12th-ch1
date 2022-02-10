package Chapter03;

//(Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
//consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum,
//which is calculated from the other 9 digits using the following formula:
//(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
//d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9),11
//If the checksum is 10, the last digit is denoted as X according to the ISBN-10
//convention. Write a program that prompts the user to enter the first 9 digits and
//displays the 10-digit ISBN (including leading zeros). Your program should read
//the input as an integer. Here are sample runs:
//VideoNote
//Sort three integers
//Enter the first 9 digits of an ISBN as integer: 013601267
//The ISBN-10 number is 0136012671
//Enter the first 9 digits of an ISBN as integer: 013031997
//The ISBN-10 number is 013031997X

import java.util.Scanner;

public class exercise09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as an integer: ");
        String isbnOriginal = input.nextLine();
        int isbn = Integer.parseInt(isbnOriginal);

        int number9 = isbn % 10;
        isbn /= 10;
        int number8 = isbn % 10;
        isbn /= 10;
        int number7 = isbn % 10;
        isbn /= 10;
        int number6 = isbn % 10;
        isbn /= 10;
        int number5 = isbn % 10;
        isbn /= 10;
        int number4 = isbn % 10;
        isbn /= 10;
        int number3 = isbn % 10;
        isbn /= 10;
        int number2 = isbn % 10;
        isbn /= 10;
        int number1 = isbn % 10;
        isbn /= 10;

        int checksum = (number1 * 1 + number2 * 2 + number3 * 3 + number4 * 4 + number5 * 5 + number6 * 6 + number7 * 7
        + number8 * 8 + number9 * 9) % 11;

        System.out.print("The ISBN-10 number is " + isbnOriginal);
        if (checksum == 10) {
            System.out.print("X");

        } else {
            System.out.print(checksum);
        }
    }
}
