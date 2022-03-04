package Chapter05;
//(Simulation: heads or tails) Write a program that simulates flipping a coin two
//millions times and displays the number of heads and tails.

public class exercise40 {
    public static void main(String[] args) {
        int numberOfHeads = 0;
        int numberOfTails = 0;
        int NUMBEROFFLIPS = 2_000_000;

        for (int i = 0; i < NUMBEROFFLIPS; i++) {
            if ((int)(Math.random() * 2) == 0) {
                numberOfHeads++;
            } else {
                numberOfTails++;
            }
        }

        System.out.println("After " + NUMBEROFFLIPS + " flips, there have been " + numberOfHeads + " heads and " +
                numberOfTails + " tails.");
    }
}
