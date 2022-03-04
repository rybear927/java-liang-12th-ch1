package Chapter05;
//(Compute e) You can approximate e using the following summation:
//e = 1 +
//1
//1!
//+
//1
//2!
//+
//1
//3!
//+
//1
//4!
//+ g +
//1
//i!
// Write a program that displays the e value for i = 1, 2, …, and 20. Format
//the number to display 16 digits after the decimal point. (Hint: Because
//i! = i * (i - 1) * c * 2 * 1, then
//1
//i!
//is
//1
//i(i - 1)!
// Initialize e and item to be 1, and keep adding a new item to e. The new item is
//the previous item divided by i, for i >= 2.)


public class exercise26 {
    public static void main(String[] args) {

        double e = 1.0;
        for (int j = 1; j <= 20; j++) {
            int sum = 1;
            for (int i = 1; i <= j; i++) {
                sum *= i;
            }
            double fraction = 1.0 / sum;
            e += fraction;
        }

        System.out.printf("In the formula where e = 1 + 1/1! + 1/2! + 1/3! + ... + 1/i! where i is 20, e is %1.16f", e);
    }
}
