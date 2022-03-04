package Chapter05;
//(Count vowels and consonants) Assume that the letters A, E, I, O, and U are vowels.
// Write a program that prompts the user to enter a string, and displays the
//number of vowels and consonants in the string.
//Enter a string: Programming is fun
//The number of vowels is 5
//The number of consonants is 11

import java.util.Scanner;

public class exercise49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = input.nextLine();
        userInput = userInput.toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < userInput.length(); i++) {
            if (isVowel(userInput.charAt(i))) {
                vowels++;
            } else if (Character.isLetter(userInput.charAt(i))){
                consonants++;
            }
        }

        System.out.println("The number of vowels is " + vowels + " and the number of consonants is " + consonants + ".");
    }

    public static boolean isVowel (char letter) {
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            return true;
        }
        return false;
    }
}
