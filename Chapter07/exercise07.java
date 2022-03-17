package Chapter07;
//(Count single digits) Write a program that generates 200 random integers between
//0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
//say counts, to store the counts, for the number of 0s, 1s, . . . , 9s.)

public class exercise07 {
    public static void main(String[] args) {
        int[] digitList = new int[10];
        for (int i = 0; i < 200; i++) {
            digitList[Character.getNumericValue(getRandomDigitCharacter())]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("There were " + digitList[i] + " " + i + "s");

        }
    }

    /** Generate a random character between ch1 and ch2 */
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /** Generate a random lowercase letter */
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    /** Generate a random uppercase letter */
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    /** Generate a random digit character */
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    /** Generate a random character */
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}
