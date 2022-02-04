package Chapter02;

//(Print a table) Write a program that displays the following table. Calculate the
//middle point of two points.
//a b Middle Point
//(0, 0) (2, 1) (1.0, 0.5)
//(1, 4) (4, 2) (2.5, 3.0)
//(2, 7) (6, 3) (4.0, 5.0)
//(3, 9) (10, 5) (6.5, 7.0)
//(4, 11) (12, 7) (8.0, 9.0)

public class exercise18 {
    public static void main(String[] args) {
        System.out.println(" a       b       Middle Point");
        System.out.println("(0, 0)  (2, 1)   (" + midpoint(0, 2) + ", " + midpoint(0, 1) + ")");
        System.out.println("(1, 4)  (4, 2)   (" + midpoint(1, 4) + ", " + midpoint(4, 2) + ")");
        System.out.println("(2, 7)  (6, 3)   (" + midpoint(2, 6) + ", " + midpoint(7, 3) + ")");
        System.out.println("(3, 9)  (10, 5)   (" + midpoint(3, 10) + ", " + midpoint(9, 5) + ")");
        System.out.println("(4, 11) (12, 7)   (" + midpoint(4, 12) + ", " + midpoint(11, 7) + ")");

    }

    public static double midpoint(int a, int b) {
        return (a + b) / 2.0;
    }
}
