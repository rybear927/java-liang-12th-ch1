package Chapter04;
//(Geometry: great circle distance) The great circle distance is the distance between
//two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the
//geographical
//latitude and longitude of two points. The great circle distance between
//the two points can be computed using the following formula:
//d = radius * arccos(sin (x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
//Write a program that prompts the user to enter the latitude and longitude of two
//points on the earth in degrees and displays its great circle distance. The average
//radius of the earth is 6,371.01 km. Note you need to convert the degrees into
//radians
//using the Math.toRadians method since the Java trigonometric methods
//use radians. The latitude and longitude degrees in the formula are for north
//and west. Use negative to indicate south and east degrees. Here is a sample run:
//VideoNote
//Compute great circle distance
//Enter point 1 (latitude and longitude) in degrees: 39.55 −116.25
//Enter point 2 (latitude and longitude) in degrees: 41.5 87.37
//The distance between the two points is 10691.79183231593 km

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double point1X = input.nextDouble();
        double point1Y = input.nextDouble();

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double point2X = input.nextDouble();
        double point2Y = input.nextDouble();

        point1X = Math.toRadians(point1X);
        point1Y = Math.toRadians(point1Y);
        point2X = Math.toRadians(point2X);
        point2Y = Math.toRadians(point2Y);

        double distance = 6371.01 * Math.acos(Math.sin(point1X) * Math.sin(point2X) + Math.cos(point1X)
        * Math.cos(point2X) * Math.cos(point1Y - point2Y));

        System.out.println("The distance between the two points is " + distance + " km");


    }
}
