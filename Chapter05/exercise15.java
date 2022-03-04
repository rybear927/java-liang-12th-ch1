package Chapter05;
//(Display the ASCII character table) Write a program that prints the characters in
//the ASCII character table from ! to ~. Display 10 characters per line. The ASCII
//table is given in Appendix B. Characters are separated by exactly one space.

public class exercise15 {
    public static void main(String[] args) {
        char END = '~';
        char currentChar = '!';
        int counter = (int)'!';
        int lineCounter = 0;

         do {
            System.out.print(currentChar + " ");
            counter ++;
            currentChar = (char)counter;
            lineCounter++;
            if (lineCounter == 10) {
                System.out.println();
                lineCounter = 0;
            }
        } while (currentChar != END);
         System.out.print("~");
    }
}
