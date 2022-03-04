package Chapter05;
//(Conversion from C° to F°) Write a program that displays the following table
//(note that Fahrenheit = Celsius * 9/5 + 32):
//Celsius Fahrenheit
//0   32.0
//2   35.6
//. . .
//98 208.4
//100 212.0

public class exercise03 {
    public static void main(String[] args) {
        System.out.printf("%-10s%10s\n", "Celsius", "Fahrenheit");
        for (int i = 0; i <= 100; i += 2) {
            System.out.printf("%-10d%10.1f\n", i, (i * 9.0 / 5 + 32));
        }
    }
}
