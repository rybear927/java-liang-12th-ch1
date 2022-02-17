package Chapter04;
//(Vowel or consonant?) Write a program that prompts the user to enter a letter and
//check whether the letter is a vowel or consonant. For a nonletter input, display
//invalid input. Here is a sample run:
//Enter a letter: B
//B is a consonant
//Enter a letter: a
//a is a vowel
//Enter a letter: #
//# is an invalid input

import java.util.Locale;
import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letter = input.next();
        String letterCopy = letter.toLowerCase();

        if (!Character.isLetter(letter.charAt(0))) {
            System.out.println(letter + " is an invalid input");
        } else if (letterCopy.charAt(0) == 'a' || letterCopy.charAt(0) == 'e' || letterCopy.charAt(0) == 'i' ||
                letterCopy.charAt(0) == 'o' || letterCopy.charAt(0) == 'u') {
            System.out.println(letter + " is a vowel");
        } else {
            System.out.println(letter + " is a consonant");
        }
    }
}
