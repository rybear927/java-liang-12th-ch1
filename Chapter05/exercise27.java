package Chapter05;
//(Display leap years) Write a program that displays all the leap years, ten per line,
//from 2014 to 2114, separated by exactly one space. Also display the number of
//leap years in this period.

public class exercise27 {
    public static void main(String[] args) {
        int numberOfLeapYears = 0;
        for (int year = 2014; year <= 2114; year++) {
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if (isLeapYear) {
                System.out.print(year + " ");
                numberOfLeapYears++;
                if (numberOfLeapYears % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("The number of leap years from 2014 to 2114 is " + numberOfLeapYears);
    }
}
