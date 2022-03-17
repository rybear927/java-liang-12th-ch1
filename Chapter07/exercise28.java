package Chapter07;
//(Math: permutations) Write a program that prompts the user to enter four integers
//and then displays all possible ways of arranging the four integers.

import java.util.Scanner;

//so, i spent over an hour thinking about this and just decided to give up for now because of these reasons:
//1. I could easily spend another hour or 2 on this, and still not have a good answer. Seems like wasted
//time when I could be investing that time on going through more manageable exercises.
//2. It seems to be outside of my zone of proximal development. The textbook writer is a university professor
//and has probably never taken an EDU class in his life; just because the problem is here doesn't mean it's good
//to do at this time.
//3. I'm proud of the hour I spent. Tried out a bunch of interesting ideas, read some stuff on stack overflow. It wasn't
//a waste at all but definitely would be if I kept going for now. I can always come back to it later.

public class exercise28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter 4 integers: ");
//        int[] list = new int[4];
//        for (int i = 0; i < 4; i++) {
//            list[i] = input.nextInt();
//        }

        int[] list = {1, 2, 3, 4};
        printPermutations(list);

    }

    public static void printPermutations(int[] list) {
        int pointer = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                printArray(swap(i, j, swap(i, j, swap(i, j, swap(i, j, list)))));
            }

        }
    }

    public static int[] swap(int i, int j, int[] list) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
        return list;
    }

    //helper methods that I will copy/paste to exercises for speeding up testing purposes
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
