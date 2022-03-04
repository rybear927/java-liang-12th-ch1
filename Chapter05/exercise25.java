package Chapter05;
//(Compute p) You can approximate p by using the following summation:
//p = 4 a1 - 1
//3
//+
//1
//5 - 1
//7
//+
//1
//9 - 1
//11
//+ g + (-)
//i+1
//2i - 1
//b
// Write a program that displays the p value for i = 10000, 20000, …, and 100000.

public class exercise25 {
    public static void main(String[] args) {
        for (int n = 10000; n <= 100_000; n += 10_000) {
            double pi = 4.0;
            int i = n;
            double sum = 0.0;
            for (int k = 1; k < 2 * i - 1; k += 4) {
                sum += 1 / (double) k;
                sum -= 1 / (double) (k + 2);
            }
            pi *= sum;
            System.out.printf("When i is %d, PI is %1.7f\n", i, pi);
        }
    }
}
