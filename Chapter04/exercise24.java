package Chapter04;
//(Enter three countries) Write a program that prompts the user to enter three
//countries and displays them in descending order. Here is a sample run:
//Enter the first country: Germany
//Enter the second country: France
//Enter the third country: Switzerland
//The three countries in descending order are Switzerland
//Germany France

import java.util.Scanner;

public class exercise24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first country: ");
        String firstCountry = input.next();
        System.out.print("Enter the second country: ");
        String secondCountry = input.next();
        System.out.print("Enter the third country: ");
        String thirdCountry = input.next();

        if (firstCountry.compareToIgnoreCase(secondCountry) > 0) {
            String temp = firstCountry;
            firstCountry = secondCountry;
            secondCountry = temp;
        }
        if (secondCountry.compareToIgnoreCase(thirdCountry) > 0) {
            String temp = secondCountry;
            secondCountry = thirdCountry;
            thirdCountry = temp;
        }
        if (firstCountry.compareToIgnoreCase(secondCountry) > 0) {
            String temp = firstCountry;
            firstCountry = secondCountry;
            secondCountry = temp;
        }

        System.out.println("The three countries in descending order are " + thirdCountry + " " + secondCountry + " " +
                firstCountry);
    }
}
