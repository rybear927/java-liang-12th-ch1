package Chapter05;
//(Sum a series) Write a program to compute the following summation:
//1
//3
//+
//3
//5
//+
//5
//7
//+
//7
//9
//+
//9
//11
//+
//11
//13
//+ g +
//95
//97
//+
//97
//99
public class exercise24 {
    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 1, j = 3; i <= 97; i += 2, j += 2) {
            sum += (double) i / j;
        }

        System.out.printf("For the series 1/3 + 3/5 + 5/7 + ... + 97/99, the sum is %1.5f", sum);

    }
}
