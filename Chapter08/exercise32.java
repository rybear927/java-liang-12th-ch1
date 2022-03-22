package Chapter08;

import java.util.Scanner;

/*
(Geometry: area of a triangle) Write a method that returns the area of a triangle
using the following header:
public static double getTriangleArea(double[][] points)
 The points are stored in a 3-by-2 two-dimensional array points with points
[0][0] and points[0][1] for (x1, y1). The triangle area can be computed
using the formula in Programming Exercise 2.19. The method returns 0 if the
three points are on the same line. Write a program that prompts the user to enter
three points of a triangle and displays the triangle’s area. Here are the sample runs:
Enter x1, y1, x2, y2, x3, y3: 2.5 2 5 −1.0 4.0 2.0
2.5 2 5 -1 4 2
The area of the triangle is 2.25
Enter x1, y1, x2, y2, x3, y3: 2 2 4.5 4.5 6 6
2 2 4.5 4.5 6 6
The three points are on the same line
 */
public class exercise32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[3][2];
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        if (onSameLine(points[0][0], points[0][1], points[1][0], points[1][1], points[2][0], points[2][1])) {
            System.out.println("The three points are on the same line.");
        } else {
            System.out.printf("The area of the triangle is %1.2f", getTriangleArea(points));
        }



    }

    public static double getTriangleArea(double[][] points) {
        double side1 = getS(points[0][0], points[0][1], points[1][0], points[1][1]);
        double side2 = getS(points[1][0], points[1][1], points[2][0], points[2][1]);
        double side3 = getS(points[2][0], points[2][1], points[0][0], points[0][1]);

        double s = (side1 + side2 + side3) / 2;

        return Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
    }

    public static double getS(double x1, double y1, double x2, double y2) {
        double xPart = Math.pow((x2 - x1), 2);
        double yPart = Math.pow((y2 - y1), 2);

        return Math.sqrt(xPart + yPart);
    }

    public static boolean onSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        double formula = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        if (formula == 0) {
            return true;
        }
        return false;
    }

}
