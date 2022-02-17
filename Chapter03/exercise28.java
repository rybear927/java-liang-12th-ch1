package Chapter03;
//(Geometry: two rectangles) Write a program that prompts the user to enter the
//center x-, y-coordinates, width, and height of two rectangles and determines
//whether the second rectangle is inside the first or overlaps with the first, as
//shown in Figure 3.9. Test your program to cover all cases.
//Enter r1’s center x-, y-coordinates, width, and height: 2.5 4 2.5 43
//Enter r2’s center x-, y-coordinates, width, and height: 1.5 5 0.5 3
//r2 is inside r1


import java.util.Scanner;

public class exercise28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter r1’s center x-, y-coordinates, width, and height: ");
        double r1CenterX = input.nextDouble();
        double r1CenterY = input.nextDouble();
        double r1Width = input.nextDouble();
        double r1Height = input.nextDouble();

        System.out.print("Enter r2’s center x-, y-coordinates, width, and height: ");
        double r2CenterX = input.nextDouble();
        double r2CenterY = input.nextDouble();
        double r2Width = input.nextDouble();
        double r2Height = input.nextDouble();

        double r1x1 = r1CenterX - r1Width / 2;
        double r1x2 = r1CenterX + r1Width / 2;
        double r1y1 = r1CenterY - r1Height / 2;
        double r1y2 = r1CenterY + r1Height / 2;

        double r2x1 = r2CenterX - r2Width / 2;
        double r2x2 = r2CenterX + r2Width / 2;
        double r2y1 = r2CenterY - r2Height / 2;
        double r2y2 = r2CenterY + r2Height / 2;

        boolean r2point1Inside = (r2x1 >= r1x1 && r2x1 <= r1x2 && r2y1 >= r1y1 && r2y1 <= r1y2);
        boolean r2point2Inside = (r2x1 >= r1x1 && r2x1 <= r1x2 && r2y2 >= r1y1 && r2y2 <= r1y2);
        boolean r2point3Inside = (r2x2 >= r1x1 && r2x2 <= r1x2 && r2y1 >= r1y1 && r2y1 <= r1y2);
        boolean r2point4Inside = (r2x2 >= r1x1 && r2x2 <= r1x2 && r2y2 >= r1y1 && r2y2 <= r1y2);

        if (r2point1Inside && r2point2Inside && r2point3Inside && r2point4Inside) {
            System.out.println("R2 is inside R1");
        } else if (r2point1Inside || r2point2Inside || r2point3Inside || r2point4Inside) {
            System.out.println("R2 overlaps R1");
        } else {
            System.out.println("R2 does not overlap R1");
        }

    }

}
