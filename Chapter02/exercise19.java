package Chapter02;
//(Geometry: area of a triangle) Write a program that prompts the user to enter
//three points, (x1, y1), (x2, y2), and (x3, y3), of a triangle then displays
//its area. The formula for computing the area of a triangle is
//s = (side1 + side2 + side3)/2;
//area = 2s(s - side1)(s - side2)(s - side3)
//Here is a sample run:
//Enter the coordinates of three points separated by spaces
//like x1 y1 x2 y2 x3 y3: 1.5 -3.4 4.6 5 9.5 -3.4
//The area of the triangle is 33.6

import java.util.Scanner;

public class exercise19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the coordinates of three points separated by spaces \nlike x1 y1 x2 y2 x3 y3: ");

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double side1 = getS(x1, y1, x2, y2);
        double side2 = getS(x2, y2, x3, y3);
        double side3 = getS(x3, y3, x1, y1);

        double s = (side1 + side2 + side3) / 2;

        double area = Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));

        System.out.println("The area of the triangle is " + area);


    }

    public static double getS(double x1, double y1, double x2, double y2) {
        double xPart = Math.pow((x2 - x1), 2);
        double yPart = Math.pow((y2 - y1), 2);

        return Math.sqrt(xPart + yPart);
    }
}
