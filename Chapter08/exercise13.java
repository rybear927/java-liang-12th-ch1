package Chapter08;

import java.io.File;
import java.util.Scanner;

//(Locate the smallest element) Write the following method that returns the location
//of the smallest element in a two-dimensional array.
//public static int[] locateSmallest(double[][] a)
// The return value is a one-dimensional array that contains two elements. These
//two elements indicate the row and column indices of the smallest element in the
//two-dimensional array. Write a test program that prompts the user to enter a two
//dimensional array and displays the location of the smallest element in the array.
//Here is a sample run:
//Enter the number of rows and columns of the array: 3 4
//Enter the array:
//23.5 35 2 10
//4.5 3 45 3.5
//35 44 5.5 9.6
//The location of the smallest element is at (0, 2)
public class exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();
        double[][] array = new double[rows][columns];
        System.out.print("Enter the array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        int[] location = getLocationOfSmallestElement(array);
        System.out.println("The location of the smallest element is at (" + location[0] + ", " + location[1] + ")");
    }

    public static int[] getLocationOfSmallestElement(double[][] array) {
        double smallestElement = array[0][0];
        int[] locations = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < smallestElement) {
                    smallestElement = array[i][j];
                    locations[0] = i;
                    locations[1] = j;
                }
            }
        }
        return locations;
    }
}
