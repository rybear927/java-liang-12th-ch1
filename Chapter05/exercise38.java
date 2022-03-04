package Chapter05;
//(Decimal to octal) Write a program that prompts the user to enter a decimal
//integer and displays its corresponding octal value. Don’t use Java’s Integer.
//toOctalString(int) in this program.


import java.util.Scanner;


//I'd like to point out that this problem was a bitch and it took me several hours of tinkering around.
//I felt like I'd never finish it but somehow the magical loop gods allowed it to be so
public class exercise38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to get the octal of it: ");
        int number = input.nextInt();

        int exponentsOf8 = 0;
        String octal = "";
        while ((int)Math.pow(8, exponentsOf8) <= number) {
            exponentsOf8++;
        }
        //still really embarrased about this line :(
        exponentsOf8--;

        for (int i = exponentsOf8; i > 0; i--) {
            int temp = 0;
            while (Math.pow(8, i) <= number) {
                temp++;
                number -= Math.pow(8, i);
            }
            octal += temp;
        }
        octal += number;

        System.out.println("octal: " + octal);
    }
}
