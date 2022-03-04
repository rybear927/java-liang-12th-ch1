package Chapter05;
//(Summation) Write a program to compute the following summation:
//1
//1 + 22
//+
//1
//22 + 23
//+
//1
//23 + 24
//+ c +
//1
//2999 + 21000

public class exercise35 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i < 1000; i++) {
            sum = 1.0 / (Math.sqrt(i) + Math.sqrt(i + 1));
        }
        System.out.println(sum);
    }
}
