package Chapter06;
//(Geometry: area of a regular polygon) A regular polygon is an n-sided polygon
//in which all sides are of the same length and all angles have the same degree
// (i.e., the polygon is both equilateral and equiangular). The formula for computing the
//area of a regular polygon is
//Area = n * s
//2
//4 * tan a
//p
//n b
//Write a method that returns the area of a regular polygon using the following
//header:
//public static double area(int n, double side)
//Write a main method that prompts the user to enter the number of sides and the
//side of a regular polygon and displays its area. Here is a sample run:
//Enter the number of sides: 5
//Enter the side: 6.5
//The area of the polygon is 72.69017017488385

import java.util.Scanner;

public class exercise36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int numberOfSides = input.nextInt();
        System.out.print("Enter the side: ");
        double sideLength = input.nextDouble();
        System.out.println("There area of the pentagon is " + area(sideLength, numberOfSides));
    }

    public static double area(double sideLength, int numberOfSides) {
        return (numberOfSides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / 5));
    }
}
