package Chapter06;
//(Twin primes) Twin primes are a pair of prime numbers that differ by 2. For
//example, 3 and 5 are twin primes, 5 and 7 are twin primes, and 11 and 13 are
//twin primes. Write a program to find all twin primes less than 1,200. Display the
//output as follows:
//(3, 5)
//(5, 7)

public class exercise29 {
    public static void main(String[] args) {
        for (int i = 1; i < 1200; i++) {
            if (isPrime(i) && twinIsPrime(i)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }

        }
    }

    public static boolean twinIsPrime(int number) {
        return isPrime(number + 2);
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
