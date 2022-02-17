package Chapter03;
//(Geometry: points in triangle?) Suppose a right triangle is placed in a plane as
//shown below. The right-angle point is placed at (0, 0), and the other two points
//are placed at (200, 0) and (0, 100). Write a program that prompts the user to enter
//a point with x- and y-coordinates and determines whether the point is inside the
//triangle.

import java.util.Scanner;

public class exercise27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Guess a point and see if it's inside the triangle (enter an x and a y): ");
        int x = input.nextInt();
        int y = input.nextInt();

        double areaABC = area(0, 0, 200, 0, 0, 100);
        double areaPBC = area(x, y, 200, 0, 0, 100);
        double areaAPC = area(0, 0, x, y, 0, 100);
        double areaABP = area(0, 0, 200, 0, x, y);

        if (Math.abs((areaPBC + areaAPC + areaABP) - areaABC) < 0.1) {
            System.out.println("Yep, that's inside the triangle.");
        } else {
            System.out.println("Nope, probably not inside.");
        }



    }

    static double area(int x1, int y1, int x2, int y2,
                       int x3, int y3)
    {
        return Math.abs((x1*(y2-y3) + x2*(y3-y1)+
                x3*(y1-y2))/2.0);
    }
}
