package Chapter02;
//(Population projection) Rewrite Programming Exercise 1.11 to prompt the user
//to enter the number of years and display the population after the number of years.
//Use the hint in Programming Exercise 1.11 for this program. Here is a sample
//run of the program:
//Enter the number of years: 5
//The population in 5 years is 325932969

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        double birthsPerYear = (365.0 * 24 * 60 * 60) / 7;
        double deathsPerYear = (365.0 * 24 * 60 * 60) / 13;
        double newImmigrantsPerYear = (365.0 * 24 * 60 * 60) / 45;
        double year1 = 312032486;

        double totalPopulation = year1 + (birthsPerYear * years) - (deathsPerYear * years) + (newImmigrantsPerYear * years);

        System.out.println(birthsPerYear);
        System.out.println(deathsPerYear);
        System.out.println(newImmigrantsPerYear);
        System.out.println(year1);
        System.out.println("The population in " + years + " years is " + totalPopulation);

    }
}
