package Chapter05;
//(Display numbers in a pyramid pattern) Write a nested for loop that prints the
//following output:

public class exercise19 {
    public static void main(String[] args) {

        //goes to next line
        for (int i = 0, r = 7; i < 8; i++, r--) {
            //prints empty spaces in front
            for (int j = 0; j < r; j++) {
                System.out.print("         ");
            }
            //prints exponents of 3 (increasing)
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-8d ", (int)Math.pow(3, j));
            }

            //prints exponents of 3 (decreasing)
            for (int j = i - 1; j >= 0 ; j--) {
                System.out.printf("%-8d ", (int)Math.pow(3, j));
            }

            System.out.println();
        }
    }
}
