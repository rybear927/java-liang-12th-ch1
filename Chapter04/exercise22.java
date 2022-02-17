package Chapter04;
//(Check substring position) Write a program that prompts the user to enter two
//strings, and reports whether the second string begins the first string.
//Enter string s1: Hello
//Enter string s2: He
//He is a prefix of Hello

import java.util.Scanner;

public class exercise22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string s1: ");
        String s1 = input.next();
        System.out.print("Enter string s2: ");
        String s2 = input.next();

        if (s1.startsWith(s2)) {
            System.out.println(s2 + " is a prefix of " + s1);
        } else {
            System.out.println(s2 + " is not a prefix of " + s1);
        }

    }
}
