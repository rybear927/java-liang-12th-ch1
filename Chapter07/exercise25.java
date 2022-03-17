package Chapter07;
//(Algebra: solve quadratic equations) Write a method for solving a quadratic equation using the following header:
//public static int solveQuadratic(double[] eqn, double[] roots)
// The coefficients of a quadratic equation ax2 + bx + c = 0 are passed to the array
//eqn and the real roots are stored in roots. The method returns the number of real
//roots. See Programming Exercise 3.1 on how to solve a quadratic equation.
// Write a program that prompts the user to enter values for a, b, and c and displays
//the number of real roots and all real roots.

import java.util.Scanner;

public class exercise25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] equation = new double[3];
        double[] roots = new double[2];

        System.out.print("Enter a, b, c: ");
        for (int i = 0; i < 3; i++) {
            equation[i] = input.nextDouble();
        }

        int numberOfRoots = solveQuadratic(equation, roots);
        if (numberOfRoots == 2) {
            System.out.println("The equation has two roots: " + roots[0] + " and " + roots[1]);
        } else if (numberOfRoots == 1) {
            System.out.println("The equation has one root " + roots[0]);
        } else {
            System.out.println("The equation has no real roots");
        }

    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];
        double discriminant = Math.pow(b, 2) - (4 * a * c);
        roots[0] = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        roots[1] = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        if (discriminant == 0) {
            return 1;
        } else if (discriminant > 0) {
            return 2;
        }
        return 0;
    }
}
