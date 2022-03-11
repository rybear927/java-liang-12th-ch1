package Chapter06;
//(Financial: credit card number validation) Credit card numbers follow certain
//patterns. A credit card number must have between 13 and 16 digits. It must start
//with
//■ 4 for Visa cards
//■ 5 for Master cards
//■ 37 for American Express cards
//■ 6 for Discover cards
//In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card
//numbers. The algorithm is useful to determine whether a card number is entered
//correctly, or whether a credit card is scanned correctly by a scanner. Credit card
//numbers are generated following this validity check, commonly known as the
//
//Programming Exercises 267
//Luhn check or the Mod 10 check, which can be described as follows (for illustration, consider the card number 4388576018402626):
// /** Return true if the card number is valid */
// public static boolean isValid(long number)
// /** Get the result from Step 2 */
// public static int sumOfDoubleEvenPlace(long number)
// /** Return this number if it is a single digit, otherwise,
// * return the sum of the two digits */
// public static int getDigit(int number)
// /** Return sum of odd-place digits in number */
// public static int sumOfOddPlace(long number)
// /** Return true if the number d is a prefix for number */
// public static boolean prefixMatched(long number, int d)
// /** Return the number of digits in d */
// public static int getSize(long d)
// /** Return the first k number of digits from number. If the
// * number of digits in number is less than k, return number. */
// public static long getPrefix(long number, int k)
//4388576018402626
//2 ∗ 2 5 4
//2 ∗ 2 5 4
//4 ∗ 2 5 8
//1 ∗ 2 5 2
//6 ∗ 2 5 12 (1 1 2 5 3)
//5 ∗ 2 5 10 (1 1 0 5 1)
//8 ∗ 2 5 16 (1 1 6 5 7)
//4 ∗ 2 5 8

//(You may also implement this program by reading the input as a string and processing the string to validate the credit card.)
//Enter a credit card number as a long integer:
// 4388576018410707
//4388576018410707 is valid
//Enter a credit card number as a long integer:
// 4388576018402626
//4388576018402626 is invalid

import java.util.Scanner;

public class exercise31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number: ");
        System.out.println(isValid(input.nextLong()));
    }

    /** Return true if the card number is valid */
    public static boolean isValid(long number) {
        int sumSteps2And3 = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        if (sumSteps2And3 % 10 != 0) {
            return false;
        } else if (!hasValidPrefix(number)) {
            return false;
        } else if (getSize(number) < 13 || getSize(number) > 16) {
            return false;
        }
        return true;
    }

    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number) {
        String numString = number + "";
        int sum = 0;
        int counter = 0;
        for (int i = numString.length() - 1; i >= 0; i--) {
            if (counter % 2 != 0) {
                sum += getDigit(2 * Character.getNumericValue(numString.charAt(i)));
            }
            counter++;
        }
        return sum;
    }

    /** Return this number if it is a single digit, otherwise,
     * return the sum of the two digits */
    public static int getDigit(int number) {
        if (number < 10) {
            return number;
        }
        String numString = number + "";
        return Character.getNumericValue(numString.charAt(0)) + Character.getNumericValue(numString.charAt(1));
    }

    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String numString = number + "";
        int counter = 0;
        for (int i = numString.length() -1; i >= 0; i--) {
            if (counter % 2 == 0) {
                sum += Character.getNumericValue(numString.charAt(i));
            }
            counter++;
        }
        return sum;
    }

    /** Return true if the number d is a prefix for number */
    public static boolean prefixMatched(long number, int d) {
        String prefix = d + "";
        String numString = number + "";

        return (numString.startsWith(prefix));
    }

    public static boolean hasValidPrefix(long number) {
        if (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37) || prefixMatched(number, 6)) {
            return true;
        }
        return false;
    }

    /** Return the number of digits in d */
    public static int getSize(long d) {
        String numString = d + "";
        return numString.length();
    }

    /** Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k) {
        String numString = number + "";
        if (numString.length() < k) {
            return Long.parseLong(numString);
        }

        String output = "";
        for (int i = 0; i < k; i++) {
            output += numString.charAt(i);
        }
        return Long.parseLong(output);
    }
}
