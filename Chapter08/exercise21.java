package Chapter08;
//(Central city) Given a set of cities, the central city is the city that has the shortest
//total distance to all other cities. Write a program that prompts the user to enter
//the number of cities and the locations of the cities (coordinates), and finds the
//central city and its total distance to all other cities.
//Enter the number of cities: 5
//Enter the coordinates of the cities:
// 2.5 5 5.1 3 1 9 5.4 54 5.5 2.1
//The central city is at (2.5, 5.0)
//The total distance to all other cities is 60.81

import java.util.Scanner;

public class exercise21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int numberOfCities = input.nextInt();
        double[][] distances = new double[numberOfCities][numberOfCities];

        // Create an array to store points
        double[][] points = new double[numberOfCities][2];
        System.out.print("Enter the coordinates of the cities: ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        // Compute distance for every two points
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                distances[i][j] = distance(points[i][0], points[i][1],
                        points[j][0], points[j][1]); // Find distance
            }
        }

        double[] sumOfDistances = new double[points.length];
        for (int i = 0; i < distances.length; i++) {
            for (int j = 0; j < distances[i].length; j++) {
                sumOfDistances[i] += distances[i][j];
            }
        }

        int centralCity = getCentral(sumOfDistances);

        System.out.println("The central city is at (" + points[centralCity][0] + ", " + points[centralCity][1] + ")");
        System.out.printf("The total distance to all other cities is %1.2f", sumOfDistances[centralCity]);
    }

    public static int getCentral(double[] sumOfDistances) {
        double smallest = sumOfDistances[0];
        int indexOfSmallest = 0;
        for (int i = 0; i < sumOfDistances.length; i++) {
            if (sumOfDistances[i] < smallest) {
                smallest = sumOfDistances[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    /**
     * Compute the distance between two points (x1, y1) and (x2, y2)
     */
    public static double distance(
            double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    //print with one space between each number
    public static void printArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
