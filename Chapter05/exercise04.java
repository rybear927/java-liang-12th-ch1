package Chapter05;
//(Conversion from inch to centimeter) Write a program that displays the following
//table (note that 1 inch is 2.54 centimeters):
//Inches Centimetres
//1 2.54
//2 5.08
//. . .
//9 22.86
//10 25.4

public class exercise04 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s\n", "Inches", "Centimeters");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-10d%-10.2f\n", i, (i * 2.54));
        }
    }
}
