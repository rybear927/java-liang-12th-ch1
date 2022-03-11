package Chapter06;
//(Display patterns) Write a method to display a pattern as follows:
// 1
// 1 2
// 1 2 3
//...
//n n–1 ... 3 2 1
//The method header is
//public static void displayPattern(int n)


import java.util.Scanner;

public class exercise06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        displayPattern(input.nextInt());
    }

    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            //print blank spaces before numbers
            for (int j = n - i; j > 0; j--) {
                System.out.printf("    ");
            }
            //print numbers
            for (int j = 1; j <= i; j++) {
                System.out.printf("%4d", j);

            }
            System.out.println();
        }
    }
}


