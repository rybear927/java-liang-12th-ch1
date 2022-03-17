package Chapter07;
//(Game: dice) Suppose three dice are thrown at random. Write a program that
//shows all possible permutations or configurations of the three dice that yield the
//sum of nine.

public class exercise29 {
    public static void main(String[] args) {
        //this is how to do it without an array...not exactly sure what they're looking for here
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                for (int k = 1; k < 6; k++) {
                    if (i + j + k == 9) {
                        System.out.println(i + " " + k + " " + j);
                    }
                }
            }
        }

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
