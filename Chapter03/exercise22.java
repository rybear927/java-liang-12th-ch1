package Chapter03;
//(Geometry: point in a circle?) Write a program that prompts the user to enter a
//point (x, y) and checks whether the point is within the circle centered at (0, 0)
//with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the
//circle, as shown in Figure 3.7a.
//(Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10.
//The formula for computing the distance is 2(x2 - x1)2 + (y2 - y1)2. Test your
//program to cover all cases.) Two sample runs are shown below:
//Enter a point with two coordinates: 4 5
//Point (4.0, 5.0) is in the circle
//Enter a point with two coordinates: 9 9
//Point (9.0, 9.0) is not in the circle

import java.util.Scanner;

public class exercise22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        boolean isInCircle = (Math.abs(Math.sqrt((Math.pow(0 - x, 2)) + Math.pow(0 - y, 2)))) <= 10 ? true : false;

        if (isInCircle) {
            System.out.println("Point (" + x + ", " + y + ") is in the circle.");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is not in the circle.");
        }
    }
}
