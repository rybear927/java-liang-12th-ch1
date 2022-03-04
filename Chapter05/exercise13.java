package Chapter05;
//(Find the largest n such that n2 6 12,000) Use a while loop to find the largest
//integer n such that n2
// is less than 12,000.

public class exercise13 {
    public static void main(String[] args) {
        int n = 0;
        int result = 0;
        while (result <= 12_000) {
            n++;
            result = (int)Math.pow(n, 2);
        }
        n--;
        result = (int)Math.pow(n, 2);

        System.out.println(n + " to the 2nd power is " + result);
    }
}
