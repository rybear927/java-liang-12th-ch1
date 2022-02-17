package Chapter03;
//(Science: wind-chill temperature) Programming Exercise 2.17 gives a formula to
//compute the wind-chill temperature. The formula is valid for temperatures in the
//range between -58F and 41°F and wind speed greater than or equal to 2. Write
//a program that prompts the user to enter a temperature and a wind speed. The
//program displays the wind-chill temperature if the input is valid; otherwise, it displays
//a message indicating whether the temperature and/or wind speed is invalid.

import java.util.Scanner;

public class exercise20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        double temp = input.nextDouble();

        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double wind = input.nextDouble();

        if (temp < -58 || temp > 41) {
            System.out.println("The given temperature is invalid");
        } else if (wind < 2) {
            System.out.println("The given wind speed is invalid");
        } else {
            double windChillIndex = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(wind, 0.16)) + (0.4275 * temp * Math.pow(wind, 0.16));

            System.out.println("The wind chill index is " + windChillIndex);
        }


    }
}
