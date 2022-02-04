package Chapter02;
//(Compute the volume of a triangle) Write a program that reads in the length of
//sides of an equilateral triangle and computes the area and volume using the following
//formulas:
//area =
//23
//4
//(length of sides)Z
//volume = area * length
//Here is a sample run:
//Enter length of the sides and height of the equilateral
//triangle:
//3.5
//The area is 3.89
//The volume of the Triangular prism is 19.48

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of the sides and height of the equilateral triangle: ");
        double sides = input.nextDouble();

        double area = (Math.sqrt(3)/4) * Math.pow(sides, 2);
        System.out.println("The area is " + area);
        System.out.println("The volume of the Triangular prism is " + area * sides);
    }
}
