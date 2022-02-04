package Chapter01;//(Average speed in miles) Assume that a runner runs 15 kilometers in 50 minutes
//and 30 seconds. Write a program that displays the average speed in miles per
//hour. (Note that 1 mile is 1.6 kilometers.)

public class exercise10 {
    public static void main(String[] args) {
        double known = 15 / 50.5;
        double unknown = 15 * 60;
        double answerKm = unknown / 50.5;
        double answerMph = answerKm / 1.6;
        System.out.println("Avg. speed of runner running 15 km in 50 minutes and 30 seconds: " + answerMph);
    }
}
