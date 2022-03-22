package Chapter08;
//(Geometry: rightmost lowest point) In computational geometry, often you need
//to find the rightmost lowest point in a set of points. Write the following method
//that returns the rightmost lowest point in a set of points:
//public static double[]
// getRightmostLowestPoint(double[][] points)
// Write a test program that prompts the user to enter the coordinates of six points
//and displays the rightmost lowest point. Here is a sample run:

import java.io.File;
import java.util.Scanner;

public class exercise34 {
    public static void main(String[] args) throws Exception{
        File file = new File("chapter08/ex34input.txt");
        Scanner input = new Scanner(file);
        double[][] points = new double[6][2];
        
        while (input.hasNext()) {
            for (int i = 0; i < points.length; i++) {
                for (int j = 0; j < points[i].length; j++) {
                    points[i][j] = input.nextDouble();
                }
            }
        }
        input.close();

        double[] rightmostLowestPoint = getRightmostLowestPoint(points);
        System.out.println("The rightmost lowest point is (" + rightmostLowestPoint[0] + ", " + rightmostLowestPoint[1] + ")");

    }

    //so googling wasn't much help unless I just wanted to copy the answer to this exact exercise....
    //so I'm gonna assume the rightmost lowest point
    //a.) has a positive x and
    //b.) its x multiplied by its y gives a larger negative number than other points' x's and y's when multiplied
    public static double[] getRightmostLowestPoint(double[][] points) {
        double[] pointsMultiplied = new double[points.length];
        for (int i = 0; i < pointsMultiplied.length; i++) {
            pointsMultiplied[i] = points[i][0] * points[i][1];
        }

        double biggestProduct = 0;
        int indexOfBiggestProduct = 0;
        for (int i = 0; i < pointsMultiplied.length; i++) {
            if (pointsMultiplied[i] < biggestProduct && points[i][0] > 0) {
                biggestProduct = pointsMultiplied[i];
                indexOfBiggestProduct = i;
            }
        }

        double[] output = {points[indexOfBiggestProduct][0], points[indexOfBiggestProduct][1]};
        return output;
    }

}
