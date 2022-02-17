package Chapter04;
//(Random points on a circle) Write a program that generates three random points
//on a circle centered at (0, 0) with radius 40 and displays three angles in a triangle
//formed by these three points, as shown in Figure 4.4a. Display the angles in
//degrees.
//(Hint: Generate a random angle a in radians between 0 and 2p, as shown
//in Figure 4.4b and the point determined by this angle is rxcos (a), rxsin (a).)

public class exercise06 {
    public static void main(String[] args) {

        double angle1 = (Math.random() * 2);
        double x1 = 40 * Math.cos(angle1);
        double y1 = 40 * Math.sin(angle1);

        double angle2 = (Math.random() * 2);
        double x2 = 40 * Math.cos(angle2);
        double y2 = 40 * Math.sin(angle2);

        double angle3 = (Math.random() * 2);
        double x3 = 40 * Math.cos(angle3);
        double y3 = 40 * Math.sin(angle3);

        System.out.println(x1 + ", " + y1);
        System.out.println(x2 + ", " + y2);
        System.out.println(x3 + ", " + y3);

        // Compute three sides
        double a = Math.sqrt((x2 - x3) * (x2 - x3)
                + (y2 - y3) * (y2 - y3));
        double b = Math.sqrt((x1 - x3) * (x1 - x3)
                + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x1 - x2) * (x1 - x2)
                + (y1 - y2) * (y1 - y2));

        // Compute three angles
        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c)
                / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c)
                / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a)
                / (-2 * a * b)));

        // Display results
        System.out.println("The three angles are " +
                Math.round(A * 100) / 100.0 + " " +
                Math.round(B * 100) / 100.0 + " " +
                Math.round(C * 100) / 100.0);

    }


}
