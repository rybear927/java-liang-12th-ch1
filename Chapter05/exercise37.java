package Chapter05;
//(Decimal to binary) Write a program that prompts the user to enter a decimal
//integer then displays its corresponding binary value. Don’t use Java’s Integer.
//toBinaryString(int) in this program.

import java.util.Scanner;

public class exercise37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number, please: ");
        int number = input.nextInt();

        int exponentsOf2 = 0;
        String binaryNumber = "";
        while ((int)Math.pow(2, exponentsOf2) <= number) {
            exponentsOf2++;
        }
        //I'm not super proud of this line but...it's the easiest fix I could think of...otherwise there's a leading 0 :(
        exponentsOf2--;

        for (int i = exponentsOf2; i >= 0; i--) {
            if ((int)Math.pow(2, exponentsOf2) <= number) {
                binaryNumber += "1";
                number -= (int)Math.pow(2, exponentsOf2);
                exponentsOf2--;
            } else {
                binaryNumber += "0";
                exponentsOf2--;
            }
        }
        System.out.println(binaryNumber);
    }
}
