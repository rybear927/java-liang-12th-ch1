package Chapter06;
//(Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the
//isPrime(int number) method for testing whether a number is prime. Use
//this method to find the number of prime numbers less than 10000.

public class exercise10 {
    public static void main(String[] args) {
        System.out.println("The number of prime numbers less than 10,000 is " + countPrimeNumbers(10000));
    }

    public static int countPrimeNumbers(int limit) {
        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness

        // Repeatedly find prime numbers
        while (number < limit) {
            // Print the prime number and increase the count
            if (isPrime(number)) {
                count++; // Increase the count
            }
            // Check if the next number is prime
            number++;
        }

        return count;
    }

    /** Check whether number is prime */
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // number is not a prime
            }
        }

        return true; // number is prime
    }
}
