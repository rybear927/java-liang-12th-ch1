package Chapter07;
//(Game: hangman) Write a hangman game that randomly generates a word and
//prompts the user to guess one letter at a time, as presented in the sample run.
//Each letter in the word is displayed as an asterisk. When the user makes a correct
//guess, the actual letter is then displayed. When the user finishes a word, display
//the number of misses and ask the user whether to continue to play with another
//word. Declare an array to store words, as follows:
//// Add any words you wish in this array
//String[] words = {"write", "that",...};
//(Guess) Enter a letter in word ******* > p
//(Guess) Enter a letter in word p****** > r
//(Guess) Enter a letter in word pr**r** > p
// p is already in the word
//(Guess) Enter a letter in word pr**r** > o
//(Guess) Enter a letter in word pro*r** > g
//(Guess) Enter a letter in word progr** > n
// n is not in the word
//(Guess) Enter a letter in word progr** > m
//(Guess) Enter a letter in word progr*m > a
//The word is program. You missed 1 time
//Do you want to guess another word? Enter y or n>


import java.util.Scanner;

public class exercise35 {
    //note: I changed some of the printed out wording because I found it to be strange and since I wanted my students
    //to see this program I didn't want them to be confused by the weird way this was written in the book
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] wordList = {"hello", "dog", "cat", "juice", "kiwi", "sun", "start", "milk", "angry", "table", "chair", "window"};
        boolean gameOver = false;
        char[] word = getWord(wordList).toCharArray();
        int[] guessedLetters = new int[word.length];
        int incorrectGuesses = 0;


        while (!gameOver) {
            //guess a letter
            System.out.print("Guess a letter in " + printWord(word, guessedLetters) + " > ");
            char guess = input.next().charAt(0);
            if (alreadyGuessed(guess, word, guessedLetters)) {
                System.out.println(guess + " has already been guessed");
            } else if (hasLetter(guess, word)){
                updateGuessedLetters(guess, word, guessedLetters);
            } else {
                System.out.println(guess + " is not in the word");
                incorrectGuesses++;
            }

            if (allLettersGuessed(guessedLetters)) {
                System.out.println("The word is " + new String(word) + ". You missed " + incorrectGuesses + " time(s)");
                System.out.print("Do you want to guess another word? Enter y or n > ");
                if (input.next().charAt(0) == 'n') {
                    gameOver = true;
                    System.out.println("Cool. Thanks for playing");
                } else {
                    System.out.println("Cool. Starting up a new game...");
                    word = getWord(wordList).toCharArray();
                    guessedLetters = new int[word.length];
                    incorrectGuesses = 0;
                }

            }
        }

    }

    public static boolean allLettersGuessed(int[] guessedLetters) {
        for (int i = 0; i < guessedLetters.length; i++) {
            if (guessedLetters[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public static void updateGuessedLetters(char guess, char[] word, int[] guessedLetters) {
        for (int i = 0; i < word.length; i++) {
            if (guess == word[i]) {
                guessedLetters[i] = 1;
            }
        }
    }

    public static boolean hasLetter(char guess, char[] word) {
        for (int i = 0; i < word.length; i++) {
            if (guess == word[i]) {
                return true;
            }
        }
        return false;
    }

    public static boolean alreadyGuessed(char guess, char[] word, int[] guessedLetters) {
        for (int i = 0; i < word.length; i++) {
            if (guess == word[i] && guessedLetters[i] == 1) {
                return true;
            }
        }
        return false;
    }

    public static String printWord(char[] word, int[] guessedLetters) {
        String output = "";
        for (int i = 0; i < guessedLetters.length; i++) {
            if (guessedLetters[i] == 0) {
                output += "*";
            } else {
                output += word[i];
            }
        }
        return output;
    }

    public static String getWord(String[] wordlist) {
        return wordlist[(int)(Math.random() * wordlist.length)];
    }

}
