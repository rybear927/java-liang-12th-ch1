package Chapter07;
//2 (Count the number of vowels in a string) Write a program that prompts the user to enter
//a string, and counts and displays the number of both lowercase and uppercase vowels
//in the string.

import java.util.Scanner;

public class exercise22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] LOWERCASE_CHARACTERS = {'a', 'e', 'i', 'o', 'u'};
        char[] UPPPERCASE_CHARACTERS = {'A', 'E', 'I', 'O', 'U'};

        System.out.print("Enter a string: ");
        String userInput = input.nextLine();
        int[] lowercaseList = getLowerCaseCount(userInput);
        int[] uppercaseList = getUpperCaseCount(userInput);

        for (int i = 0; i < 5; i++) {
            System.out.println(lowercaseList[i] + " " + LOWERCASE_CHARACTERS[i] + "(s)");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(uppercaseList[i] + " " + UPPPERCASE_CHARACTERS[i] + "(s)");
        }

    }

    public static int[] getLowerCaseCount(String userInput) {
        int[] list = new int[5];
        for (int i = 0; i < userInput.length(); i++) {
            switch (userInput.charAt(i)) {
                case 'a':
                    list[0]++;
                    break;
                case 'e':
                    list[1]++;
                    break;
                case 'i':
                    list[2]++;
                    break;
                case 'o':
                    list[3]++;
                    break;
                case 'u':
                    list[4]++;
                    break;
                default:
                    break;
            }
        }
        return list;
    }

    public static int[] getUpperCaseCount(String userInput) {
        int[] list = new int[5];
        for (int i = 0; i < userInput.length(); i++) {
            switch (userInput.charAt(i)) {
                case 'A':
                    list[0]++;
                    break;
                case 'E':
                    list[1]++;
                    break;
                case 'I':
                    list[2]++;
                    break;
                case 'O':
                    list[3]++;
                    break;
                case 'U':
                    list[4]++;
                    break;
                default:
                    break;
            }
        }
        return list;
    }


    //helper methods that I will copy/paste to exercises for speeding up testing purposes
    public static void printArray(double[] array) {
        System.out.println(java.util.Arrays.toString(array));
    }

    public static void printArray(int[] array) {
        System.out.println(java.util.Arrays.toString(array));
    }

    public static void printArray(String[] array) {
        System.out.println(java.util.Arrays.toString(array));
    }
}
