package Chapter04;
//(Geometry: area of a regular polygon) A regular polygon is an n-sided polygon
//in which all sides are of the same length and all angles have the same degree (i.e.,
//the polygon is both equilateral and equiangular). The formula for computing the
//area of a regular polygon is
//Area =
//n * s2
//4 * tan(
//p
//n
//)
//Programming Exercises 175
//Here, s is the length of a side. Write a program that prompts the user to enter the
//number of sides and their length of a regular polygon and displays its area. Here
//is a sample run:
//Enter the number of sides: 5
//Enter the side: 6.5
//The area of the polygon is 72.69017017488385

import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        double numberOfSides = input.nextDouble();

        System.out.print("Enter the length of a side: ");
        double sideLength = input.nextDouble();

        double area = (numberOfSides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / numberOfSides));

        System.out.println("The area of the polygon is " + area);
    }
}
