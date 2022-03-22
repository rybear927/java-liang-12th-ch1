package Chapter08;
//(Points nearest to each other) Listing 8.3 gives a program that finds two points in
//a two-dimensional space nearest to each other. Revise the program so it finds two
//points in a three-dimensional space nearest to each other. Use a two-dimensional
//array to represent the points. Test the program using the following points:
//double[][] points = {{−1, 0, 3}, {−1, −1, −1}, {4, 1, 1},
// {2, 0.5, 9}, {3.5, 2, −1}, {3, 1.5, 3}, {−1.5, 4, 2},
// {5.5, 4, −0.5}};
// The formula for computing the distance between two points (x1, y1, z1) and
//(x2, y2, z2) is 2(x2 - x1)
//2 + (y2 - y1)
//2 + (z2 - z1)
//2
//.
public class exercise07 {
    public static void main(String[] args) {
        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2}, {5.5, 4, -0.5}};
        double[][] distances = new double[points.length][points.length];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                distances[i][j] = getDistance3D(points[i][0], points[i][1], points[i][2], points[j][0], points[j][1], points[j][2]);
            }
        }
        printArray(distances);
        int[] index = getIndexOfShortestDistance(distances);
        System.out.println("The shortest distance is " + distances[index[0]][index[1]]);
        System.out.println("which is from point (" + points[2][0] + ", " + points[2][1] + ", " + points[2][2] + ")");
        System.out.println("to point (" + points[4][0] + ", " + points[4][1] + ", " + points[4][2] + ")");
    }
    
    public static int[] getIndexOfShortestDistance(double[][] array) {
        int[] coordinates = {0, 0};
        double shortestDistance = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((array[i][j] < shortestDistance || shortestDistance == 0) && array[i][j] > 0.00001) {
                    shortestDistance = array[i][j];
                    coordinates[0] = i;
                    coordinates[1] = j;
                }
            }
        }
        return coordinates;
    }

    public static double getDistance3D(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
    }

    //print with one space between each number
    public static void printArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%1.1f ", array[i][j]);
            }
            System.out.println();
        }
    }
}
