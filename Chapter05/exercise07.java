package Chapter05;
//(Financial application: compute future tuition) Suppose that the tuition for a
//university is $10,000 this year and increases 6% every year. In one year, the
//tuition will be $10,600. Write a program that computes the tuition in ten years
//and the total cost of four years’ worth of tuition after the tenth year.

import jdk.swing.interop.SwingInterOpUtils;

public class exercise07 {
    public static void main(String[] args) {
        int startingCost = 10_000;
        double INCREASE = 1.06;
        int tuitionAfter10Years = startingCost;
        int last4YearsCost = 0;
        for (int i = 0; i < 10; i++) {
            tuitionAfter10Years *= INCREASE;
            if (i > 5) {
                last4YearsCost += tuitionAfter10Years;
            }
        }
        System.out.println("Tuition for the last 4 years of the 10 years would be $" + last4YearsCost);
    }
}
