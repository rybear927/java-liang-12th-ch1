package Chapter03;

import java.util.Scanner;

//(Current time) Revise Programming Exercise 2.8 to display the hour using a
//12-hour clock. Here is a sample run:
//Enter the time zone offset to GMT: −5
//The current time is 4:50:34 AM

public class exercise30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        long offset = input.nextLong();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds/1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = (totalHours + offset) % 24;

        boolean isAM = (currentHour < 12);

        if (currentHour > 12) {
            currentHour -= 12;
        } if (currentHour == 0) {
            currentHour = 12;
        }

        System.out.print("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
        if (isAM) {
            System.out.print(" AM");
        } else {
            System.out.print(" PM");
        }
    }
}
