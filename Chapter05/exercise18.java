package Chapter05;
//(Display four patterns using loops) Use nested loops that display the following
//patterns in four separate programs:

public class exercise18 {
    public static void main(String[] args) {
        int counter = 6;

        //Pattern A
        /*
        for (int i = 0; i <= counter; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
         */

        //Pattern B
        /*
        for (int i = counter; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
         */

        //Pattern C
        /*
        for (int i = 0, spaces = 5; i <= counter; i++, spaces--) {
            for (int k = spaces; k >= 0; k--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

         */

        //Pattern D
        for (int i = counter, spaces = 0; i >= 0; i--, spaces++) {
            for (int k = spaces; k > 0; k--) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
