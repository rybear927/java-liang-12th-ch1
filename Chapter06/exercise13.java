package Chapter06;
//(Sum series) Write a method to compute the following series:
//m(i) = 1
//3
//+
//2
//4
//+ g +
//i
//i + 2
//Write a test program that displays the following table:
//I m(i)
//1 0.3333
//2 0.8333
//. . .
//19 14.7093
//20 15.6184

public class exercise13 {
    public static void main(String[] args) {
        System.out.println("I\t\tm(i)");
        System.out.println("______________");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-2d\t\t%-4.4f\n", i, getSumOfSeries(i));
        }

    }

    public static double getSumOfSeries(int i) {
        double sum = 0;
        for (int j = 1; j <= i; j++) {
            sum += (double)j / (j + 2);
        }
        return sum;
    }
}
