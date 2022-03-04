package Chapter05;
//(Find the smallest n such that n3 7 12,000) Use a while loop to find the smallest integer n such that n3
// is greater than 12,000.

public class exercise12 {
    public static void main(String[] args) {
        int n = 0;
        int result = 0;
        while (result <= 12_000) {
            n++;
            result = (int)Math.pow(n, 3);
        }
        System.out.println(n + " to the 3rd power is " + result);
    }
}
