package Chapter02;
//(Geometry: area of a hexagon) Write a program that prompts the user to enter the
//side of a hexagon and displays its area. The formula for computing the area of a
//hexagon is
//Area =
//323
//2
//s2,
//where s is the length of a side. Here is a sample run:
//Enter the length of the side: 5.5
//The area of the hexagon is 78.5918

import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the side: ");
        double side = input.nextDouble();

        double area = ((3 * Math.sqrt(3)) / 2) * Math.pow(side, 2);

        System.out.println("The area of the hexagon is " + area);
    }
}
