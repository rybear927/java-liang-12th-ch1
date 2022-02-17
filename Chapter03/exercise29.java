package Chapter03;
// (Geometry: two circles) Write a program that prompts the user to enter the center
//coordinates and radii of two circles and determines whether the second circle
//is inside the first or overlaps with the first, as shown in Figure 3.10. (Hint: circle2
//is inside circle1 if the distance between the two centers 6 = r1 − r2
//and circle2 overlaps circle1 if the distance between the two centers 6 =
//r1 + r2. Test your program to cover all cases.)
//Here are the sample runs:
//Enter circle1’s center x-, y-coordinates, and radius: 0.5 5.1 13
//Enter circle2’s center x-, y-coordinates, and radius: 1 1.7 4.5
//circle2 is inside circle1

import java.util.Scanner;

public class exercise29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter circle1’s center x-, y-coordinates, and radius: ");
        double circle1CenterX = input.nextDouble();
        double circle1CenterY = input.nextDouble();
        double circle1Radius = input.nextDouble();

        System.out.print("Enter circle2’s center x-, y-coordinates, and radius: ");
        double circle2CenterX = input.nextDouble();
        double circle2CenterY = input.nextDouble();
        double circle2Radius = input.nextDouble();

        double distanceBetweenCircleCenters = getDistanceBetween2Points(circle1CenterX, circle1CenterY, circle2CenterX, circle2CenterY);

        if (circle1Radius >= (distanceBetweenCircleCenters + circle2Radius)) {
            System.out.println("Circle2 is inside Circle1");
        } else if ((circle1Radius + circle2Radius) >= distanceBetweenCircleCenters) {
            System.out.println("Circle2 overlaps Circle1");
        } else {
            System.out.println("Circle2 does not overlap Circle1");
        }


    }

    public static double getDistanceBetween2Points (double x1, double y1, double x2, double y2) {
        double xPart = Math.pow((x2 - x1), 2);
        double yPart = Math.pow((y2 - y1), 2);
        return Math.sqrt(xPart + yPart);
    }
}
