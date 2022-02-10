package Chapter03;
//(Random point) Write a program that displays a random coordinate in a rectangle.
//The rectangle is centred at (0, 0) with width 50 and height 150.

public class exercise16 {
    public static void main(String[] args) {
        int width = (int)(Math.random() * 50) - 25;
        int height = (int)(Math.random() * 150) - 75;

        System.out.println("The width is " + width + " and the height is " + height);
    }
}
