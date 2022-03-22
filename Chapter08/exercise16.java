package Chapter08;
//(Sort two-dimensional array) Write a method to sort a two-dimensional array
//using the following header:
//public static void sort(int m[][])
// The method performs a primary sort on rows, and a secondary sort on columns.
//For example, the following array
//{{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
// will be sorted to
//{{4, 5},{4, 2},{4, 1},{1, 7},{1, 2},{1, 1}}.

public class exercise16 {
    public static void main(String[] args) {
        int[][] array = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
        System.out.print("Original array: ");
        printArray(array);
        System.out.println();
        sort(array);
        System.out.print("Sorted array: ");
        printArray(array);
    }

    public static void sort(int m[][]) {
        bubbleSortByRowAndColumn(m);
    }

    //print with one space between each number
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("{" + array[i][0] + ", " + array[i][1] + "} ");
        }
    }

    //bubble sort decreasing order by row first and then column
    public static void bubbleSortByRowAndColumn(int[][] array) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i][0] < array[i + 1][0]) {
                    int temp = array[i][0];
                    array[i][0] = array[i + 1][0];
                    array[i + 1][0] = temp;
                    temp = array[i][1];
                    array[i][1] = array[i + 1][1];
                    array[i + 1][1] = temp;
                    unsorted = true;
                } else if (array[i][0] == array[i + 1][0] && array[i][1] < array[i + 1][1]) {
                    int temp = array[i][0];
                    array[i][0] = array[i + 1][0];
                    array[i + 1][0] = temp;
                    temp = array[i][1];
                    array[i][1] = array[i + 1][1];
                    array[i + 1][1] = temp;
                    unsorted = true;
                }
            }
        }
    }
}
