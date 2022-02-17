package Chapter04;
//(Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point
//at the 0 o’clock position, as shown in Figure 4.4c. Write a program that prompts
//the user to enter the radius of the bounding circle of a pentagon and displays the
//coordinates of the five corner points on the pentagon from p1 to p5 in this order. Use
//console format to display two digits after the decimal point. Here is a sample run:
//Enter the radius of the bounding circle: 100.52
//The coordinates of five points on the pentagon are
//(95.60, 31.06)
//(0.00, 100.52)
//(−95.60, 31.06)
//(−58.08, −81.32)
//(59.08, −81.32)

import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();
        double x0 = 0;
        double y0 = radius;

        double angle1 = Math.PI * (.5 + .4);
        double x1 = radius * Math.cos(angle1);
        double y1 = radius * Math.sin(angle1);

        double angle2 = Math.PI * (.5 + .4 + .4);
        double x2 = radius * Math.cos(angle2);
        double y2 = radius * Math.sin(angle2);

        double angle3 = Math.PI * (.5 + .4 + .4 + .4);
        double x3 = radius * Math.cos(angle3);
        double y3 = radius * Math.sin(angle3);

        double angle4 = Math.PI * (.5 + .4 + .4 + .4 + .4);
        double x4 = radius * Math.cos(angle4);
        double y4 = radius * Math.sin(angle4);

        System.out.println("The coordinates of the 5 points on the pentagon are: ");
        System.out.println("(" + x0 + ", " + y0 + ")");
        System.out.println("(" + x1 + ", " + y1 + ")");
        System.out.println("(" + x2 + ", " + y2 + ")");
        System.out.println("(" + x3 + ", " + y3 + ")");
        System.out.println("(" + x4 + ", " + y4 + ")");


    }
}
