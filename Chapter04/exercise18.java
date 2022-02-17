package Chapter04;
//(Student major and status) Write a program that prompts the user to enter two
//characters and displays the major and status represented in the characters. The
//first character indicates the major and the second is number character 1, 2, 3, 4,
//which indicates whether a student is a freshman, sophomore, junior, or senior.
//Suppose the following characters are used to denote the majors:
//I: Information Management
//C: Computer Science
//A: Accounting
//Here is a sample run:
//Enter two characters: I1
//Information Management Freshman

import java.util.Scanner;

public class exercise18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        String majorAndYear = input.next();

        char major = majorAndYear.charAt(0);
        char year = majorAndYear.charAt(1);
        String output = "";

        if (major == 'I') {
            output = "Information Management";
        } else if (major == 'C') {
            output = "Computer Science";
        } else {
            output = "Accounting";
        }

        if (year == '1') {
            output += " Freshman";
        } else if (year == '2') {
            output += " Sophomore";
        } else if (year == '3') {
            output += " Junior";
        } else {
            output += " Senior";
        }

        System.out.println(output);

    }
}
