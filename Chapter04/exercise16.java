package Chapter04;
//(Random character) Write a program that displays a random lowercase letter
//using the Math.random() method.

public class exercise16 {

    public static void main(String[] args) {
        //'a' = 97, 'z' = 122
            int number = (int)(Math.random() * 26) + 97;
            System.out.println((char)number);
    }
}
