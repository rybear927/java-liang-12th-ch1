package Chapter06;

public class exercise32 {
    public static void main(String[] args) {
        int gameWins = 0;
        int TIMES_PLAYED = 15_000;
        for (int i = 0; i < TIMES_PLAYED; i++) {
            if (playGameNoDialogue()) {
                gameWins++;
            }
        }
        System.out.println("You played craps " + TIMES_PLAYED + " time(s) and won " + gameWins + " time(s).");
    }

    public static boolean playGameNoDialogue() {
        int die1 = -1;
        int die2 = -1;
        int point = -1;
        int sum = -1;
        boolean gameOver = false;
        boolean pointEstablished = false;

        while (!gameOver) {
            sum = rollADie() + rollADie();

            if (!pointEstablished) {
                if (sum == 2 || sum == 3 || sum == 12) {
                    return false;
                } else if (sum == 7 || sum == 11) {
                    return true;
                } else {
                    point = sum;
                    pointEstablished = true;
                }
            } else {
                if (sum == 7) {
                    return false;
                } else if (sum == point) {
                   return true;
                }
            }
        }
        System.out.println("Somehow you left the game loop :(");
        return false;
    }

    public static int rollADie() {
        return (int) (Math.random() * 6) + 1;
    }
}
