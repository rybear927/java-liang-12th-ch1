package Chapter05;
//(Financial application: find the sales amount) You have just started a sales job
//in a department store. Your pay consists of a base salary and a commission. The
//base salary is $5,000. The scheme shown below is used to determine the commission rate.
//Sales Amount Commission Rate
//$0.01–$5,000 6 percent
//$5,000.01–$10,000 8 percent
//$10,000.01 and above 10 percent
//Note that this is a graduated rate. The rate for the first $5,000 is at 6%, the next
//$5000 is at 8%, and the rest is at 10%. If your sales amounts to $25,000, the
//commission is 5,000 * 6% + 5,000 * 8% + 15,000 * 10% = 2,200.
//Your goal is to earn $30,000 a year. Write a program to find the minimum sales
//you have to generate in order to make $30,000.

import java.util.Scanner;

public class exercise39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How much you wanna make at this shit job? \nEnter a number and I'll tell you how" +
                " much sales you gotta do: ");
        int initialGoal = input.nextInt();

        int SIXPERCENTLIMIT = 5000;
        double SIXPERCENTRATE = 0.06;
        int EIGHTPERCENTLIMIT = 10000;
        double EIGHTPERCENTRATE = 0.08;
        double TENPERCENTRATE = 0.1;

        if (initialGoal <= 5000) {
            System.out.println("You don't gotta sell nothing. Just kick it.");
            System.exit(0);
        }

        double counter = 0.0;
        double sales = 0.0;

        //six percent
        while (counter < initialGoal - 5000 && sales < SIXPERCENTLIMIT) {
            sales += 0.01;
            counter += 0.01 * SIXPERCENTRATE;
        }

        //eight percent
        while (counter < initialGoal - 5000 && sales < EIGHTPERCENTLIMIT) {
            sales += 0.01;
            counter += 0.01 * EIGHTPERCENTRATE;
        }

        //ten percent
        while (counter < initialGoal - 5000) {
            sales += 0.01;
            counter += 0.01 * TENPERCENTRATE;
        }

        System.out.printf("You'd have to sell $%1.2f to make $%1d", sales, initialGoal);
    }
}
