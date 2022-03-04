package Chapter05;
//(Business application: checking ISBN) Use loops to simplify Programming
//Exercise  3.9.

import java.util.Scanner;

public class exercise36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as an integer: ");
        String isbnOriginal = input.nextLine();
        int isbn = Integer.parseInt(isbnOriginal);


        //new part using loops
         int checksum = 0;
        for (int i = 9; i >= 1; i--) {
            checksum += (isbn % 10) * i;
            isbn /= 10;
        }
        checksum = checksum % 11;

        //old part
//        int number9 = isbn % 10;
//        isbn /= 10;
//        int number8 = isbn % 10;
//        isbn /= 10;
//        int number7 = isbn % 10;
//        isbn /= 10;
//        int number6 = isbn % 10;
//        isbn /= 10;
//        int number5 = isbn % 10;
//        isbn /= 10;
//        int number4 = isbn % 10;
//        isbn /= 10;
//        int number3 = isbn % 10;
//        isbn /= 10;
//        int number2 = isbn % 10;
//        isbn /= 10;
//        int number1 = isbn % 10;
//        isbn /= 10;
//
//        int checksum = (number1 * 1 + number2 * 2 + number3 * 3 + number4 * 4 + number5 * 5 + number6 * 6 + number7 * 7
//                + number8 * 8 + number9 * 9) % 11;

        System.out.print("The ISBN-10 number is " + isbnOriginal);
        if (checksum == 10) {
            System.out.print("X");
        } else {
            System.out.print(checksum);
        }
    }
}
