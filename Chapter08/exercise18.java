package Chapter08;
//(Shuffle rows) Write a method that shuffles the rows in a two-dimensional int
//array using the following header:
//public static void shuffle(int[][] m)
// Write a test program that shuffles the following matrix:
//int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

public class exercise18 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        shuffle(m);
        printArray(m);

    }

    public static void shuffle(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int targetIndex = i;
            //to prevent from shuffling with itself
            while (targetIndex == i) {
                targetIndex = (int)(Math.random() * m.length);
            }
            int temp = m[targetIndex][0];
            m[targetIndex][0] = m[i][0];
            m[i][0] = temp;
            temp = m[targetIndex][1];
            m[targetIndex][1] = m[i][1];
            m[i][1] = temp;
        }
    }

    //print with one space between each number
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
