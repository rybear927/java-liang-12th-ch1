package Chapter01;//1.11 (Population projection) The U.S. Census Bureau projects population based on
//the following assumptions:
//■■ One birth every 7 seconds
//■■ One death every 13 seconds
//■■ One new immigrant every 45 seconds
//Write a program to display the population for each of the next five years. Assume
//that the current population is 312,032,486, and one year has 365 days. Hint: In Java,
//if two integers perform division, the result is an integer. The fractional part is truncated.
//For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate
//result with the fractional part, one of the values involved in the division must be
//a number with a decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.

public class exercise11 {
    public static void main(String[] args) {
        double birthsPerYear = (365.0 * 24 * 60 * 60) / 7;
        double deathsPerYear = (365.0 * 24 * 60 * 60) / 13;
        double newImmigrantsPerYear = (365.0 * 24 * 60 * 60) / 45;
        double year1 = 312032486;
        double year2 = year1 + birthsPerYear - deathsPerYear + newImmigrantsPerYear;
        double year3 = year2 + birthsPerYear - deathsPerYear + newImmigrantsPerYear;
        double year4 = year3 + birthsPerYear - deathsPerYear + newImmigrantsPerYear;
        double year5 = year4 + birthsPerYear - deathsPerYear + newImmigrantsPerYear;
        System.out.println("births per year: " + birthsPerYear);
        System.out.println("Population in the US per year");
        System.out.println("Year 1: " + year1);
        System.out.println("Year 2: " + year2);
        System.out.println("Year 3: " + year3);
        System.out.println("Year 4: " + year4);
        System.out.println("Year 5: " + year5);

    }
}
