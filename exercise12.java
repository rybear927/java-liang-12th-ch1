//1.12 (Average speed in kilometers) Assume that a runner runs 24 miles in 1 hour, 40
//minutes, and 35 seconds. Write a program that displays the average speed in
//kilometers per hour. (Note 1 mile is equal to 1.6 kilometers.)
//
public class exercise12 {
    public static void main(String[] args) {
        double secondsPerHour = 60 * 60.0;
        double runnerSeconds = secondsPerHour + (40 * 60) + 35;
        double numerator = 24 * secondsPerHour;
        double answer = numerator / runnerSeconds;
        System.out.println(answer * 1.6);
    }
}
