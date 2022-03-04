package Chapter05;
//(Demonstrate cancellation errors) A cancellation error occurs when you are
//manipulating a very large number with a very small number. The large number
//may cancel out the smaller number. For example, the result of 100000000.0
//+ 0.000000001 is equal to 100000000.0. To avoid cancellation errors and
//obtain more accurate results, carefully select the order of computation. For example, in computing the following summation, you will obtain more accurate
//results by computing from right to left rather than from left to right:
//1 +
//1
//2
//+
//1
//3
//+ c +
//1
//n
// Write a program that compares the results of the summation of the preceding
//series, computing from left to right and from right to left with n = 50000.

public class exercise23 {
    public static void main(String[] args) {
        System.out.println("In an equation where 1 + 1/2 + 1/3 + ... + 1/n, you will see how adding left");
        System.out.println("to right and right to left produce different results in Java (adding right to left is ");
        System.out.println("more accurate). For our purposes, n will be 50,000.");

        double leftToRightSum = 1.0;
        double rightToLeftSum = 1.0;

        for (int i = 2; i <= 50_000; i++) {
                leftToRightSum += 1.0 / i;
        }

        for (int i = 50_000; i >= 2; i--) {
                rightToLeftSum += 1.0 / i;
        }

        System.out.println("");
        System.out.printf("Adding from left to right produced this result: %1.18f\n", leftToRightSum);
        System.out.printf("Adding from right to left produced this result: %1.18f", rightToLeftSum);


    }
}
