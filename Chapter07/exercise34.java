package Chapter07;
//(Sort characters in a string) Write a method that returns a sorted string using the
//following header:
//public static String sort(String s)
//For example, sort("acb") returns abc.
// Write a test program that prompts the user to enter a string and displays the sorted
//string.

import java.util.Scanner;

public class exercise34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");

        System.out.println("After sorting, the string is " + sort(input.nextLine()));
    }

    public static String sort(String s) {
        char[] tempArray = new char[s.length()];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = s.charAt(i);
        }
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < tempArray.length - 1; i++) {
                if (tempArray[i] > tempArray[i + 1]) {
                    char tempCharacter = tempArray[i];
                    tempArray[i] = tempArray[i + 1];
                    tempArray[i + 1] = tempCharacter;
                    unsorted = true;
                }
            }
        }
        return new String(tempArray);
    }

}
