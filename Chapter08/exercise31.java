package Chapter08;

import java.util.Scanner;

/*
(Geometry: intersecting points) Write a method that returns the intersecting points of
two lines. The intersecting points of the two lines can be found by using the formula
given in Programming Exercise 3.25. Assume that (points[0][1, points[0][1) and (points[1][0], points[1][1]) are the
two pointss on line 1 and (points[2][0], points[2][1]) and (points[3][0], points[3][1]) are on line 2. The method header is:
public static double[] getIntersectingpoints(double[][] pointss)
 The pointss are stored in a 4-by-2 two-dimensional array pointss with (pointss
[0][0], pointss[0][1]) for (points[0][1, points[0][1). The method returns the intersecting points
or null if the two lines are parallel. Write a program that prompts the user to enter
four pointss and displays the intersecting points. See Programming Exercise 3.25
for a sample run.
2 2 5 −1.0 4.0 2.0 −1.0 −2.0
2 2 5 -1 4 2 -1 -2
 */
public class exercise31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double[][] points = new double[4][2];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        double[] xy = getIntersectingpoints(points);

    }

    public static double[] getIntersectingpoints(double[][] points) {

        double denominator = ((points[0][0] - points[1][0]) * (points[2][1] - points[3][1])) - ((points[0][1] - points[1][1]) * (points[2][0] - points[3][0]));

        if (denominator == 0) {
            System.out.println("The equation has no solution.");
        } else {
            double intersectionX = (((points[0][0] * points[1][1] - points[0][1] * points[1][0]) * (points[2][0] - points[3][0])) - ((points[0][0] - points[1][0]) * (points[2][0] * points[3][1] - points[2][1] * points[3][0]))) / denominator;
            double intersectionY = (((points[0][0] * points[1][1] - points[0][1] * points[1][0]) * (points[2][1] - points[3][1])) - ((points[0][1] - points[1][1]) * (points[2][0] * points[3][1] - points[2][1] * points[3][0]))) / denominator;
            System.out.println("x is " + intersectionX + " and y is " + intersectionY);
            double[] xy = {intersectionX, intersectionY};
            return xy;
        }

        return null;
    }

}
