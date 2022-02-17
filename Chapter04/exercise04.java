package Chapter04;
//(Geometry: Area of a five-pointed star) The area of a five-pointed star can be
//computed using the following formula (r is the radius of the inscribing circle):
//Area = 10 *
//tan(
//p
//10
//)
//3 - tan(
//p
//10
//) * tan(
//p
//10
//)
//* r2
//Write a program that prompts the user to enter the radius of the inscribing circle
//and displays its area. Here is a sample run:
//Enter the radius of the circle inscribing the star: 30
//The area of the star is 1010.3129473040672

import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle inscribing the star: ");
        double circleArea = input.nextDouble();

        double starArea = 10 * ((Math.tan((Math.PI / 10)) / (3 - Math.tan((Math.PI / 10)) * Math.tan((Math.PI / 10))))) * Math.pow(circleArea, 2);

        System.out.println("The area of the star is " + starArea);
    }
}
