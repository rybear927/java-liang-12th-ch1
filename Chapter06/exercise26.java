package Chapter06;
//(Palindromic prime) A palindromic prime is a prime number and also palindromic.
// For example, 131 is a prime and also a palindromic prime, as are 313
//and 757. Write a program that displays the first 120 palindromic prime numbers.
//Display 10 numbers per line, separated by exactly one space, as follows:
//2 3 5 7 11 101 131 151 181 191
//313 353 373 383 727 757 787 797 919 929

public class exercise26 {
    public static void main(String[] args) {

        int counter = 0;
        int number = 2;
        while (counter < 120) {
            if (isPalindrome(number) && isPrime(number)){
                System.out.printf("%-3d ", number);
                counter++;
                if (counter % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }
    }

    public static boolean isPalindrome(int number) {
        String numberString = number + "";
        for (int i = 0, j = numberString.length() - 1; i < j; i++, j--) {
            if (numberString.charAt(i) != numberString.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // number is not a prime
            }
        }

        return true; // number is prime
    }
}
