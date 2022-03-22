package Chapter08;
//(Financial application: compute tax) Rewrite Listing 3.5, ComputeTax.java,
//using arrays. For each filing status, there are six tax rates. Each rate is applied
//to a certain amount of taxable income. For example, from the taxable income of
//$400,000 for a single filer, $8,350 is taxed at 10%, (33,950 - 8,350) at 15%,
//(82,250 - 33,950) at 25%, (171,550 - 82,550) at 28%, (372,550 - 82,250) at
//33%, and (400,000 - 372,950) at 36%. The six rates are the same for all filing
//statuses, which can be represented in the following array:
//double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
// The brackets for each rate for all the filing statuses can be represented in a twodimensional array as follows:
//int[][] brackets = {
//{8350, 33950, 82250, 171550, 372950}, // Single filer
//{16700, 67900, 137050, 20885, 372950}, // Married jointly
//// −or qualifying widow(er)
//{8350, 33950, 68525, 104425, 186475}, // Married separately
//{11950, 45500, 117450, 190200, 372950} // Head of household
//};
// Suppose the taxable income is $400,000 for single filers. The tax can be computed as follows:
//tax = brackets[0][0] * rates[0] +
// (brackets[0][1] – brackets[0][0]) * rates[1] +
// (brackets[0][2] – brackets[0][1]) * rates[2] +
// (brackets[0][3] – brackets[0][2]) * rates[3] +
// (brackets[0][4] – brackets[0][3]) * rates[4] +
// (400000 – brackets[0][4]) * rates[5];

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter filing status
        System.out.print("(0-single filer, 1-married jointly or " +
                "qualifying widow(er), 2-married separately, 3-head of " +
                "household) Enter the filing status: ");

        int incomeTaxBracket = input.nextInt();

        // Prompt the user to enter taxable income
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };
        double tax = 0;
        for (int i = 0; i <= income; i++) {
            if (i < brackets[incomeTaxBracket][0] && i > 0) {
                tax += rates[0] * 1;
            } else if (i < brackets[incomeTaxBracket][1] && i > brackets[incomeTaxBracket][0]) {
                tax += rates[1] * 1;
            } else if (i < brackets[incomeTaxBracket][2] && i > brackets[incomeTaxBracket][1]) {
                tax += rates[2] * 1;
            } else if (i < brackets[incomeTaxBracket][3] && i > brackets[incomeTaxBracket][2]) {
                tax += rates[3] * 1;
            } else if (i < brackets[incomeTaxBracket][4] && i > brackets[incomeTaxBracket][3]) {
                tax += rates[4] * 1;
            } else {
                tax += rates[5] * 1;
            }
        }
        System.out.printf("Income tax: $%1.2f", tax);




    }
}
