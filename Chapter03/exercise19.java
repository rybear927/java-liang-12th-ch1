package Chapter03;
//(Compute the perimeter of a rectangle) Write a program that read two edges of a
//rectangle and computes the perimeter if the input is valid. Otherwise, display that
//the input is invalid. The input is valid if both edges are of different lengths.

import java.util.Scanner;

public class exercise19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Provide the length and width of the rectangle: ");
        double length = input.nextDouble();
        double width = input.nextDouble();

        if (length != width) {
            System.out.println("The perimeter of the rectangle is " + (2 * length + 2 * width));
        } else {
            System.out.println("The input is invalid");
        }
    }
}
