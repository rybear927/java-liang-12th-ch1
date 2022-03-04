package Chapter05;
//(Process string) Write a program that prompts the user to enter a string and displays the characters at even positions.
// Here is a sample run:
//Enter a string: Beijing Chicago
//ejnhcg

import java.util.Scanner;

public class exercise48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();
        String output = "";

        for (int i = 1; i < userInput.length(); i+=2) {
            output += userInput.charAt(i);
        }

        System.out.println(output);

    }

}
