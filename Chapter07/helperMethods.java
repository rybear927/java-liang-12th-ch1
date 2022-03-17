package Chapter07;

public class helperMethods {
    public static void printArray(double[] array) {
        System.out.println("The array is: " + java.util.Arrays.toString(array));
    }

    public static void printArray(int[] array) {
        System.out.println("The array is: " + java.util.Arrays.toString(array));
    }

    public static void printArray(String[] array) {
        System.out.println("The array is: " + java.util.Arrays.toString(array));
    }

    public static void printArray(char[] array) {
        System.out.println("The array is: " + java.util.Arrays.toString(array));
    }

    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //sort in ascending order
    public static void bubbleSort(double[] array) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
    }
    //sort in ascending order
    public static void bubbleSort(int[] array) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
    }
    //sort in ascending order
    public static String bubbleSort(String array) {
        char[] tempArray = new char[array.length()];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = array.charAt(i);
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
