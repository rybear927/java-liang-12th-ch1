package Chapter06;
//(Emirp) An emirp (prime spelled backward) is a nonpalindromic prime number
//whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so
//17 and 71 are emirps. Write a program that displays the first 120 emirps. Display
//10 numbers per line, separated by exactly one space, as follows:
//13 17 31 37 71 73 79 97 107 113
//149 157 167 179 199 311 337 347 359 389

public class exercise27 {
    public static void main(String[] args) {

        int counter = 0;
        int number = 2;
        while (counter < 120) {
            if (!isPalindrome(number) && isPrime(number) && isPrime(getReverse(number))){
                System.out.printf("%-3d ", number);
                counter++;
                if (counter % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }
    }

    public static int getReverse(int number) {
        String numString = number + "";
        String reverseOfNumber = "";
        for (int i = 0; i < numString.length(); i++) {
            reverseOfNumber = numString.charAt(i) + reverseOfNumber;
        }
        return Integer.parseInt(reverseOfNumber);
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
