package Chapter07;
//(Random number selector) Write a method that returns a random number from a
//list of numbers passed in the argument. The method header is specified as follows:
//public static int getRandom(int... numbers)

import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        System.out.println(getRandom(array1));
    }

    public static int getRandom(int... numbers) {
        return numbers[(int)(Math.random() * numbers.length)];
    }

    //helper methods that I will copy/paste to every exercise for speeding up testing purposes
    public static void printArray(double[] array) {
        System.out.println("The array is: " + java.util.Arrays.toString(array));
    }
    public static void printArray(int[] array) {
        System.out.println("The array is: " + java.util.Arrays.toString(array));
    }
    public static void printArray(String[] array) {
        System.out.println("The array is: " + java.util.Arrays.toString(array));
    }

}
