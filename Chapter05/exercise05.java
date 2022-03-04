package Chapter05;
//(Conversion from Cº to Fº and Fº to Cº) Write a program that displays the following two tables side by side:
//Celsius Fahrenheit | Fahrenheit Celsius
//0   32.000 | 20  −6.667
//2   35.600 | 25  −3.889
//. . .
//98  208.400 | 265 129.444
//100  212.000 | 270 132.222

public class exercise05 {
    public static void main(String[] args) {
        System.out.printf("%-10s%10s   |   %-10s%10s\n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
        for (int i = 0, j = 20; i <= 100; i += 2, j += 5) {
            System.out.printf("%-10d%8.3f     |   %-10d%10.3f\n", i, (i * 9.0 / 5 + 32), j, (j - 32) * 5.0 / 9);
        }
    }
}
