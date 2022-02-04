package Chapter02;
//(Physics: Motion) Newton’s equation of motion for distance covered given initial
//velocity, constant acceleration, and total time is described by the expression
//s = ut +
//1
//2
//at2
//Write a program that prompts the user to enter the initial velocity u in meters/
//second, time span t in seconds and acceleration a in meters/second2, and returns
//the distance covered. Here is a sample run
//Enter u,t, and a: 3.5 4 6.5
//The distance covered is 14.0

import java.util.Scanner;

public class exercise09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter u,t, and a: ");
        double u = input.nextDouble();
        double t = input.nextDouble();
        double a = input.nextDouble();

        System.out.println(u);
        System.out.println(t);
        System.out.println(a);

        //note: this is not outputting the answer that the textbook gives, but I
        //honestly don't know if it's my mistake or the pdf's mistake
        double output = (u * t) + ((1/2.0) * a * (t * t));

        System.out.println("The distance covered is " + output);
    }
}
