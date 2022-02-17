package Chapter04;
//(Find the Unicode of a character) Write a program that receives a character and
//displays its Unicode. Here is a sample run:
//Enter a character: E
//The Unicode for the character E is 69


import java.util.Scanner;

//Note: to be perfectly honest, I'm not understanding what the difference is between this
//      and exercise 08
public class exercise09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char userCharacter = input.next().charAt(0);

        System.out.println("The Unicode for character " + userCharacter + " is " + (int)userCharacter);
    }
}
