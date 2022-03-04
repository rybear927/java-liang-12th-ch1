package Chapter05;
//(Conversion from square meter to ping) Write a program that displays the following two tables side by side
// (note that 1 ping = 3.305 square meters):
//Ping Square meter | Square meter Ping
//10 33.050 | 30 9.077
//15 49.575 | 35 10.590
//. . .
//75 247.875 | 95 28.744
//80 264.400 | 100 30.257

public class exercise06 {
    public static void main(String[] args) {
        System.out.printf("%-10s%10s   |   %-10s%10s\n", "Ping", "Square Meter", "Square Meter", "Ping");
        for (int i = 10, j = 30; i <= 80; i += 5, j += 5) {
            System.out.printf("%-10d%-8.3f       |   %-18d%-10.3f\n", i, (i * 3.305), j, j / 3.305);
        }
    }
}
