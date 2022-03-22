package Chapter08;
//(Financial tsunami) Banks lend money to each other. In tough economic times, if a
//bank goes bankrupt, it may not be able to pay back the loan. A bank’s total assets are
//its current balance plus its loans to other banks. The diagram in Figure 8.8 shows
//five banks. The banks’ current balances are 25, 125, 175, 75, and 181 million dollars, respectively. The directed edge from node 1 to node 2 indicates that bank 1
//lends 40 million dollars to bank 2.
//If a bank’s total assets are under a certain limit, the bank is unsafe. The money it
//borrowed cannot be returned to the lender, and the lender cannot count the loan in
//its total assets. Consequently, the lender may also be unsafe, if its total assets are
//under the limit. Write a program to find all the unsafe banks. Your program reads
//the input as follows. It first reads two integers n and limit, where n indicates the
//number of banks and limit is the minimum total assets for keeping a bank safe. It
//then reads n lines that describe the information for n banks with IDs from 0 to n−1.
// The first number in the line is the bank’s balance, the second number indicates
//the number of banks that borrowed money from the bank, and the rest are pairs
//of two numbers. Each pair describes a borrower. The first number in the pair is
//the borrower’s ID and the second is the amount borrowed. For example, the input
//for the five banks in Figure 8.8 is as follows (note the limit is 201):
//5 201
//25 2 1 100.5 4 320.5
//125 2 2 40 3 85
//175 2 0 125 3 75
//75 1 0 125
//181 1 2 125
// The total assets of bank 3 are (75 + 125), which is under 201, so bank 3 is unsafe.
//After bank 3 becomes unsafe, the total assets of bank 1 fall below (125 + 40).
//Thus, bank 1 is also unsafe. The output of the program should be
//Unsafe banks are 3 1
// (Hint: Use a two-dimensional array borrowers to represent loans. borrowers[i][j] indicates the loan that bank i provides to bank j. Once bank j
//becomes unsafe, borrowers[i][j] should be set to 0.)

import java.io.File;
import java.util.Scanner;

public class exercise17 {
    //note: they didn't specify that the input had to be from the keyboard so I'm inputting from a file
    public static void main(String[] args) throws Exception {
        File file = new File("chapter08/ch08ex17input.txt");
        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            //input data from file
            int numberOfBanks = input.nextInt();
            int limit = input.nextInt();
            double[][] banks = new double[numberOfBanks][numberOfBanks * 2];
            for (int i = 0; i < numberOfBanks; i++) {
                for (int j = 0; j < 2; j++) {
                    banks[i][j] = input.nextDouble();
                }
                for (int j = 2; j < (banks[i][1] * 2) + 2; j++) {
                    banks[i][j] = input.nextDouble();
                }
            }

            //tally up the assets of each bank
            double[] totalAssets = new double[numberOfBanks];
            for (int i = 0; i < numberOfBanks; i++) {
                totalAssets[i] += banks[i][0];
                for (int j = 3; j < banks[i].length; j += 2) {
                    totalAssets[i] += banks[i][j];
                }
            }

            //print the info you got and the total assets
            printArray(banks);
            System.out.println();
            for (int i = 0; i < totalAssets.length; i++) {
                System.out.println(totalAssets[i]);
            }
            System.out.println();

            //figure out who's underwater
           findWhoIsUnderWater(totalAssets, banks, limit);

            //print who's underwater
            System.out.print("Unsafe banks are ");
            for (int i = 0; i < totalAssets.length; i++) {
                if (totalAssets[i] < limit) {
                    System.out.print(i + " ");
                }

            }
        }
        input.close();
    }

    public static void findWhoIsUnderWater(double[] totalAssets, double[][] banks, int limit) {
        boolean wasChanged = true;
        while (wasChanged) {
            wasChanged = false;
            //look at each bank
            for (int j = 0; j < banks.length; j++) {
                //skip the unsafe banks since we already know they're unsafe
                if (!isUnsafe(j, totalAssets, limit)) {
                    //start from column 2 and look at each bank it's borrowing from
                    for (int i = 2; i < (banks[j][1] * 2) + 2; i += 2) {
                        //if it's borrowing from an unsafe bank, mark that in the banks total assets
                        //and change how much it's borrwing from the unsafe bank to 0 so it won't
                        //be counted double when the loop goes around again
                        if (isUnsafe(banks[j][i], totalAssets, limit) && banks[j][i + 1] != 0) {
                            totalAssets[j] -= banks[j][i + 1];
                            banks[j][i + 1] = 0;
                            wasChanged = true;
                        }
                    }
                }
            }
        }
    }

    public static boolean isUnsafe(double number, double[] totalAssets, int limit) {
        if (totalAssets[(int) number] < limit) {
            return true;
        }
        return false;
    }

    //print with one space between each number
    public static void printArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
