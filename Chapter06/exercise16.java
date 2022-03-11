package Chapter06;
//(Number of days in a year) Write a method that returns the number of days in a
//year using the following header:
//public static int numberOfDaysInAYear(int year)
//Write a test program that displays the number of days in the years between 2014
//and 2034.

public class exercise16 {
    public static void main(String[] args) {
        System.out.println("Year\tNumber of days");
        for (int i = 2014; i < 2034; i++) {
            System.out.println(i + "\t" + numberOfDaysInAYear(i));
        }
    }

    public static int numberOfDaysInAYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return 366;
        }
        return 365;
    }
}
