package Chapter06;
//(Estimate p) p can be computed using the following summation:
//m(i) = 4a1 - 1
//3
//+
//1
//5 - 1
//7
//+
//1
//9 - 1
//11
//+ g + (-1)
//i+1
//2i - 1 b
//Write a method that returns m(i) for a given i and write a test program that
//displays the following table:
//i m(i)
//1 4.0000
//101 3.1515
//201 3.1466
//301 3.1449
//401 3.1441
//501 3.1436
//601 3.1433
//701 3.1430
//801 3.1428
//901 3.1427

public class exercise14 {
    public static void main(String[] args) {
        System.out.println("i\t\tm(i)");
        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-3d\t\t%1.4f\n", i, getPiWithi(i));
        }
    }

    public static double getPiWithi(int i) {
        double sumOfFractions = 0.0;
        for (int j = 1; j <= i; j++) {
            if (j % 2 != 0) {
                sumOfFractions += 1.0 / ((2 * j) - 1);
            } else {
                sumOfFractions -= 1.0 / ((2 * j) - 1);
            }
        }
        return 4.0 * sumOfFractions;
    }
}
