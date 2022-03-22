package Chapter08;

import java.util.Scanner;

/*
(Geometry: polygon subareas) A convex four-vertex polygon is divided into four
triangles, as shown in Figure 8.9.
 Write a program that prompts the user to enter the coordinates of four vertices and
displays the areas of the four triangles in increasing order. Here is a sample run:
Enter x1, y1, x2, y2, x3, y3, x4, y4:
 -2.5 2 4 4 3 -2 -2 -3.5
The areas are 6.17 7.96 8.08 10.42
 */
public class exercise33 {
    /*
    Have you ever written a piece of code that took 5 times as long as it should have?
    And so many times you think you're about to cross the finish line, but you end up stumbling?
    And then finally, at 3:16am you somehow claw your way across the finish line. No one is there to cheer for you.
    They all went home long ago. It's just you and this piece of code that looks gnarly and half-baked, but you know what?
    It fucking works. It does.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[4][2];
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        double[] intersectingPoint = getIntersectingpoints(points);
        double[][] triangle1 = {{intersectingPoint[0], intersectingPoint[1]}, {points[0][0], points[0][1]}, {points[1][0], points[1][1]}};
        double[][] triangle2 = {{intersectingPoint[0], intersectingPoint[1]}, {points[1][0], points[1][1]}, {points[2][0], points[2][1]}};
        double[][] triangle3 = {{intersectingPoint[0], intersectingPoint[1]}, {points[2][0], points[2][1]}, {points[3][0], points[3][1]}};
        double[][] triangle4 = {{intersectingPoint[0], intersectingPoint[1]}, {points[3][0], points[3][1]}, {points[0][0], points[0][1]}};
        double[] triangleAreas = {getTriangleArea(triangle1), getTriangleArea(triangle2), getTriangleArea(triangle3), getTriangleArea(triangle4)};
        bubbleSort(triangleAreas);
        System.out.print("The areas are ");
        for (int i = 0; i < triangleAreas.length; i++) {
            System.out.printf("%1.2f ", triangleAreas[i]);
        }
    }

    //sort in ascending order
    public static void bubbleSort(double[] array) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
    }

    public static double[] getIntersectingpoints(double[][] points1) {
        double[][] points = new double[points1.length][points1[0].length];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = points1[i][j];
            }
        }

        double temp0 = points[1][0];
        points[1][0] = points[2][0];
        points[2][0] = temp0;
        double temp1 = points[1][1];
        points[1][1] = points[2][1];
        points[2][1] = temp1;
        double denominator = ((points[0][0] - points[1][0]) * (points[2][1] - points[3][1])) - ((points[0][1] - points[1][1]) * (points[2][0] - points[3][0]));

        if (denominator == 0) {
            System.out.println("The equation has no solution.");
        } else {
            double intersectionX = (((points[0][0] * points[1][1] - points[0][1] * points[1][0]) * (points[2][0] - points[3][0])) - ((points[0][0] - points[1][0]) * (points[2][0] * points[3][1] - points[2][1] * points[3][0]))) / denominator;
            double intersectionY = (((points[0][0] * points[1][1] - points[0][1] * points[1][0]) * (points[2][1] - points[3][1])) - ((points[0][1] - points[1][1]) * (points[2][0] * points[3][1] - points[2][1] * points[3][0]))) / denominator;
            double[] xy = {intersectionX, intersectionY};
            return xy;
        }

        return null;
    }

    public static double[][] getPoints(int excludingRow, double[][] points) {
        double[][] triangle = new double[3][2];
        for (int i = 0, triangleRow = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                if (i == excludingRow) {
                    continue;
                } else {
                    triangle[triangleRow][j] = points[i][j];
                }
            }
            if (i != excludingRow) {
                triangleRow++;
            }
        }
        return triangle;
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
}
