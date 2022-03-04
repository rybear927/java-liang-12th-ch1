package Chapter05;
//(Business: check ISBN-13) ISBN-13 is a new standard for identifying books. It
//uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last digit d13 is a checksum,
//which is calculated from the other digits using the following formula:
//10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12),10
//If the checksum is 10, replace it with 0. Your program should read the input as a
//string. Display “invalid input” if the input is invalid. Here are sample runs:
//Enter the first 12 digits of an ISBN-13 as a string: 978013213080
//The ISBN-13 number is 9780132130806

import java.util.Scanner;

public class exercise47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String isbn13 = input.next();
        int checksum = 0;

        if (isbn13.length() != 12) {
            System.out.println("Incorrect length.");
            System.exit(0);
        }

        for (int i = 0; i < isbn13.length(); i++) {
            if (!Character.isDigit(isbn13.charAt(i))) {
                System.out.println("One of the inputs is not a digit");
                System.exit(0);
            } else if (i % 2 == 0) {
                checksum += Integer.parseInt("" + isbn13.charAt(i));
                System.out.println("Just the digit: " + Integer.parseInt("" + isbn13.charAt(i)));
            } else {
                checksum += Integer.parseInt(isbn13.charAt(i) + "") * 3;
                System.out.println("Digit x3: " + Integer.parseInt(isbn13.charAt(i) + "") * 3);
            }
        }

        checksum = 10 - checksum % 10;
        if (checksum == 10) {
            checksum = 0;
        }

        System.out.println("The ISBN-13 number is " + isbn13 + checksum);


    }
}
