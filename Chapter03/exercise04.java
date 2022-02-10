package Chapter03;
//(Random Color) Write a program that randomly generates an integer between
//1 and 7 and displays the name of a color in the rainbow—violet, indigo, blue,
//green, yellow, orange, and red—for numbers 1, 2, 3, . . . , 7 accordingly.

public class exercise04 {
    public static void main(String[] args) {
        int colorNumber = (int)(Math.random() * 7) + 1;
        if (colorNumber == 1) {
            System.out.println("수한");
        } else if (colorNumber == 2) {
            System.out.println("채연");
        } else if (colorNumber == 3) {
            System.out.println("서영");
        } else if (colorNumber == 4) {
            System.out.println("하준");
        } else if (colorNumber == 5) {
            System.out.println("몽순");
        } else if (colorNumber == 6) {
            System.out.println("몽선");
        } else if (colorNumber == 7) {
            System.out.println("모카");
        }
    }
}
