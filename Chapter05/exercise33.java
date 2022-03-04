package Chapter05;
//(Perfect number) A positive integer is called a perfect number if it is equal to the sum
//of all of its positive divisors, excluding itself. For example, 6 is the first perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1. There are
//four perfect numbers 6 10,000. Write a program to find all these four numbers.

public class exercise33 {
    public static void main(String[] args) {
        int sum = 0;
        for (int j = 1; j < 10000; j++) {

            for (int i = 1; i < j; i++) {
                if (j % i == 0) {
                    sum += i;
                }
            }
            if (sum == j) {
                System.out.println("One of the perfect numbers below 10,000 is " + sum);
            }
            sum = 0;
        }
    }
}
