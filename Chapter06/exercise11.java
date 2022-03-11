package Chapter06;
//(Financial application: compute commissions) Write a method that computes the
//commission, using the scheme in Programming Exercise 5.39. The header of the
//method is as follows:
//public static double computeCommission(double salesAmount)
//Write a test program that displays the following table:
//Sales Amount Commission
//10000 900.0
//15000 1500.0
//20000 2100.0
//25000 2700.0
//30000 3300.0
//35000 3900.0
//40000 4500.0
//45000 5100.0
//50000 5700.0
//55000 6300.0
//60000 6900.0
//65000 7500.0
//70000 8100.0
//75000 8700.0
//80000 9300.0
//85000 9900.0
//90000 10500.0
//95000 11100.0
//100000 11700.0


public class exercise11 {

    //Note: I think the numbers in the example are not correct, so I'm just gonna print out my numbers
    //the way that they are

    public static void main(String[] args) {
        System.out.println("Sales Amount\tCommission");
        for (int i = 10000; i <= 100_000; i += 5000) {
            System.out.printf("%-16d%-10.2f\n", i, computeCommission(i));
        }

    }

    public static double computeCommission(double salesAmount) {

        int SIXPERCENTLIMIT = 5000;
        double SIXPERCENTRATE = 0.06;
        int EIGHTPERCENTLIMIT = 10000;
        double EIGHTPERCENTRATE = 0.08;
        double TENPERCENTRATE = 0.1;
        double commission = 0.0;
        double sales = 0.0;

        //six percent
        while (sales < salesAmount && sales < SIXPERCENTLIMIT) {
            sales += 0.01;
            commission += 0.01 * SIXPERCENTRATE;
        }

        //eight percent
        while (sales < salesAmount && sales < EIGHTPERCENTLIMIT) {
            sales += 0.01;
            commission += 0.01 * EIGHTPERCENTRATE;
        }

        //ten percent
        while (sales < salesAmount) {
            sales += 0.01;
            commission += 0.01 * TENPERCENTRATE;
        }

        return commission;
    }
}
