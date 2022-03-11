package Chapter06;
/*
(Conversions between pounds and kilograms) Write a class that contains the following two methods:
/** Convert from pounds to kilograms */
//public static double poundToKilogram(double pound)

/*public static double kilogramToPound(double kilogram)
The formula for the conversion is:
pound = 0.453 * kilogram
kilogram = 2.204 * pound
Write a test program that invokes these methods to display the following tables:
Kilograms Pounds | Pounds Kilograms
1 2.2 | 20 9.09
3 6.6 | 25 11.36
. . . 0 0
197 433.4 | 510 231.82
199 437.8 | 515 234.09
 */


public class exercise09 {

    /**
     * note: I wrote this at a cafe on my shitty laptop and couldn't use a mouse so I'm not gonna bother refining it
     * so that the numbers all line up further on down, sorry
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Kilogams  Pounds /  Pounds  Kilograms");
        System.out.println("____________________________________");
        for (int i = 1, j = 20; i <= 200; i+=2, j+=5) {
            System.out.printf("%1d\t  %1.3f  /  %1d\t    %1.3f\n", i, kilogramToPound(i), j, poundToKilogram(j));
        }
    }

    public static double poundToKilogram(double pound) {
        return 2.204 * pound;
    }
    /** Convert from kilograms to pounds */
    public static double kilogramToPound(double kilogram) {
        return 0.453 * kilogram;
    }

}