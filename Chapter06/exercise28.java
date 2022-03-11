package Chapter06;
//(Mersenne prime) A prime number is called a Mersenne prime if it can be written
//in the form 2p - 1 for some positive integer p. Write a program that finds all
//Mersenne primes with p … 31 and displays the output as follows:
//p 2^p – 1
//2 3
//3 7
//5 31

public class exercise28 {

    public static void main(String[] args) {

        for (int i = 2; i <= 31; i++) {
            if (isPrime(i)) {
                System.out.println(i + "\t" + getMersenne(i));
            }
        }
    }

    public static int getMersenne(int number) {
        return ((int)(Math.pow(2, number)) - 1);
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
