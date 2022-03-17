package Chapter07;
//(Execution time) Write a program that creates an array of numbers from 1 to
//100,000,000 in ascending order. Display the execution time of invoking the
//linear Search method and the binary Search method in Listings 7.6 and
//7.7 respectively. Display the execution time of invoking both searches for the
//following numbers: 1; 25,000,000; 50,000,000; 75,000,000; 100,000,000. You
//can use the following code template to obtain the execution time:
//long startTime = System.nanoTime();
//perform the task;
//long endTime = System.NanoTime();
//long executionTime = endTime − startTime;

public class exercise16 {
    public static void main(String[] args) {
        int[] array = new int[100_000_000];
        for (int i = 0; i < 100_000_000; i++) {
            array[i] = i;
        }

        System.out.println("When searching through an array of 100,000,000 numbers: ");
        System.out.println("searching for 1 using linear search took " + returnSearchTimeWithLinear(array, 1) + " nanoseconds");
        System.out.println("searching for 1 using binary search took " + returnSearchTimeWithBinary(array, 1) + " nanoseconds");
        System.out.println("searching for 25,000,000 using linear search took " + returnSearchTimeWithLinear(array, 25000000) + " nanoseconds");
        System.out.println("searching for 25,000,000 using binary search took " + returnSearchTimeWithBinary(array, 25000000) + " nanoseconds");
        System.out.println("searching for 50,000,000 using linear search took " + returnSearchTimeWithLinear(array, 50_000_000) + " nanoseconds");
        System.out.println("searching for 50,000,000 using binary search took " + returnSearchTimeWithBinary(array, 50_000_000) + " nanoseconds");
        System.out.println("searching for 75,000,000 using linear search took " + returnSearchTimeWithLinear(array, 75_000_000) + " nanoseconds");
        System.out.println("searching for 75,000,000 using binary search took " + returnSearchTimeWithBinary(array, 75_000_000) + " nanoseconds");
        System.out.println("searching for 100,000,000 using linear search took " + returnSearchTimeWithLinear(array, 100_000_000) + " nanoseconds");
        System.out.println("searching for 100,000,000 using binary search took " + returnSearchTimeWithBinary(array, 100_000_000) + " nanoseconds");

    }

    public static long returnSearchTimeWithLinear(int[] array, int key) {
        long startTime = System.nanoTime();
        linearSearch(array, key);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long returnSearchTimeWithBinary(int[] array, int key) {
        long startTime = System.nanoTime();
        binarySearch(array, key);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }

        return -low - 1; // Now high < low
    }
}
