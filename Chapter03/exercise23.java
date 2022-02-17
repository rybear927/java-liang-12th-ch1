package Chapter03;
//(Geometry: point in a rectangle?) Write a program that prompts the user to enter
//a point (x, y) and checks whether the point is within the rectangle centered at
//(1, 1) with width 10 and height 5. For example, (2, 2) is inside the rectangle and
//(6, 4) is outside the rectangle, as shown in Figure 3.7b. (Hint: A point is in the
//rectangle if its horizontal distance to (1, 1) is less than or equal to 10 / 2 and its
//vertical distance to (1, 1) is less than or equal to 5.0 / 2. Test your program to
//cover all cases.)

import java.util.Scanner;

public class exercise23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter and x and a y coordinate and see if the point is in the rectangle: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if (Math.abs(x) <= (10 / 2) + 1 || Math.abs(y) <= (5 / 2) + 1) {
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle.");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle.");
        }
    }
}
