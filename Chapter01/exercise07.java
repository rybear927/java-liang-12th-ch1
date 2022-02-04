package Chapter01;//(Approximate p) p can be computed using the following formula:
//p = 4 * a1 -
//1
//3
//+
//1
//5
//-
//1
//7
//+
//1
//9
//-
//1
//11
//+ c b
//Write a program that displays the result of 4 * a1 -
//1
//3 +
//1
//5 -
//1
//7 +
//1
//9 -
//1
//11
//b
//and 4 * a1 -
//1
//3 +
//1
//5 -
//1
//7 +
//1
//9 -
//1
//11 +
//1
//13
//b . Use 1.0 instead of 1 in your
//program.

public class exercise07 {
    public static void main(String[] args) {
        System.out.println(4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
        System.out.println(4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13)));

    }
}
