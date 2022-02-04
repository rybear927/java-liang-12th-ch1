package Chapter01;//(Area and perimeter of a circle) Write a program that displays the area and perimeter
//of a circle that has a radius of 6.5 using the following formula:
//p = 3.14159
//perimeter = 2 * radius * p
//area = radius * radius * p


import static java.lang.Math.PI;

public class exercise08 {
    public static void main(String[] args) {
        System.out.println("Circle radius: 6.5");
        System.out.println("Perimeter: " + 2 * 6.5 * PI);
        System.out.println("Area: " + 6.5 * 6.5 * PI);
    }
}
