package Chapter07;
//(Game: bean machine) The bean machine, also known as a quincunx or the Galton box, is a device for statistics experiments named after English scientist Sir
//Francis Galton. It consists of an upright board with evenly spaced nails (or pegs)
//in a triangular form, as shown in Figure 7.13.
//Balls are dropped from the opening of the board. Every time a ball hits a nail, it
//has a 50% chance of falling to the left or to the right. The piles of balls are accumulated in the slots at the bottom of the board.
// Write a program that simulates the bean machine. Your program should prompt the
//user to enter the number of the balls and the number of the slots in the machine.
//Simulate the falling of each ball by printing its path. For example, the path for
//the ball in Figure 7.13b is LLRRLLR and the path for the ball in Figure 7.13c is
//RLRRLRR. Display the final buildup of the balls in the slots in a histogram. Here
//is a sample run of the program:
// (Hint: Create an array named slots. Each element in slots stores the number of
//balls in a slot. Each ball falls into a slot via a path. The number of Rs in a path is the
//position of the slot where the ball falls. For example, for the path LRLRLRR, the ball
//falls into slots[4], and for the path RRLLLLL, the ball falls into slots[2].)
//Enter the number of balls to drop: 5
//Enter the number of slots in the bean machine: 8
//LRLRLRR
//RRLLLRR
//LLRLLRR
//RRLLLLL
//LRLRRLR
// O
// O
// OOO

import java.util.Scanner;

public class exercise37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int numberOfBalls = input.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int numberOfSlots = input.nextInt();
        int[] ballPositions = new int[numberOfSlots];
        for (int i = 0; i < numberOfBalls; i++) {
            ballPositions[getNumberOfRs(getBallPath(numberOfSlots))]++;
        }
        printSlots(ballPositions);
    }

    public static void printSlots(int[] array) {
        int height = getHeight(array);
        for (int j = height; j > 0; j--) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0 && array[i] >= j) {
                    System.out.print('O');
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static int getHeight(int[] array) {
        int height = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                height = array[i];
            }
        }
        return height;
    }

    public static int getNumberOfRs(char[] array) {
        int numOfRs = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'R') {
                numOfRs++;
            }
        }
        return numOfRs;
    }

    public static char[] getBallPath(int numberOfSlots) {
        char[] ballPath = new char[numberOfSlots - 1];
        for (int i = 0; i < ballPath.length; i++) {
            ballPath[i] = getRorL();
        }
        printArray(ballPath);
        return ballPath;
    }

    public static char getRorL() {
        if ((int) (Math.random() * 2) == 1) {
            return 'R';
        }
        return 'L';
    }

    public static void printArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
