package Chapter06;

/*
(Conversions between mile and kilometer) Write a class that contains the following two methods:
/** Convert from Mile to Kilostatic double mileToKilometer(double mile)
/** Convert from Kilometer to Mile */
/*
260 Chapter 6 Methods
The formula for the conversion is:
1 mile = 1.6 kilometers
Write a test program that invokes these methods to display the following tables:
Miles Kilometers | Kilometers Miles
1 1.609 | 20 12.430
2 3.218 | 25 15.538
. . .
9 14.481 | 60 37.290
10 16.090 | 65 40.398
 */

public class exercise08 {
    public static void main(String[] args) {
        System.out.println("Miles   Kilometers /\tKilometers   Miles");
        System.out.println("_______________________________________");
        for (int i = 1, j = 20; i <= 10; i++, j+=5) {
            System.out.printf("%1d\t%1.3f\t   /\t%1d\t     %1.3f\n", i, mileToKilometer(i), j, mileToKilometer(j));
        }
    }

    /** Convert from Mile to Kilometer */
    public static double mileToKilometer(double mile) {
        return mile * 1.6;
    }
    /** Convert from Kilometer to Mile */
    public static double kilometerToMile(double kilometer) {
        return kilometer / 1.6;
    }
}

