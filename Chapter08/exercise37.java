package Chapter08;

import java.io.File;
import java.util.Scanner;

/*
(Guess the capitals) Write a program that repeatedly prompts the user to enter
a capital for a state. Upon receiving the user input, the program reports whether
the answer is correct. Assume that 50 states and their capitals are stored in a
two-dimensional array, as shown in Figure 8.10. The program prompts the user to
answer all states’ capitals and displays the total correct count. The user’s answer
is not case-sensitive.
Alabama Montgomery
Alaska Juneau
Arizona Phoenix
... ...
What is the capital of Alabama? Montogomery
The correct answer should be Montgomery
What is the capital of Alaska? Juneau
Your answer is correct
What is the capital of Arizona? ...
...
The correct count is 35
 */
public class exercise37 {
    public static void main(String[] args) throws Exception{
        File file = new File("chapter08/ex37input.txt");
        Scanner input = new Scanner(file);
        Scanner inputKeyboard = new Scanner(System.in);
        String[][] statesAndCapitalsArray = new String[50][2];

        while (input.hasNext()) {
            for (int i = 0; i < statesAndCapitalsArray.length; i++) {
                for (int j = 0; j < statesAndCapitalsArray[i].length; j++) {
                    statesAndCapitalsArray[i][j] = input.next();
                }
            }
        }
        input.close();

        removeHyphens(statesAndCapitalsArray);
        int correctCount = 0;
        for (int i = 0; i < statesAndCapitalsArray.length; i++) {
            System.out.print("What is the capital of " + statesAndCapitalsArray[i][0] + "? ");
            if (inputKeyboard.nextLine().equalsIgnoreCase(statesAndCapitalsArray[i][1])) {
                System.out.println("Your answer is correct.");
                correctCount++;
            } else {
                System.out.println("The correct answer should be " + statesAndCapitalsArray[i][1]);
            }
        }
        System.out.println("The correct count is " + correctCount);
    }

    public static void removeHyphens(String[][] statesCapitalsArray) {
        for (int i = 0; i < statesCapitalsArray.length; i++) {
            for (int j = 0; j < statesCapitalsArray[i].length; j++) {
                String temp = "";
                for (int k = 0; k < statesCapitalsArray[i][j].length(); k++) {
                    if (statesCapitalsArray[i][j].charAt(k) != '-') {
                        temp += statesCapitalsArray[i][j].charAt(k);
                    } else {
                        temp += ' ';
                    }

                }
                statesCapitalsArray[i][j] = temp;
            }

        }
    }
}
