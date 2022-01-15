package dsa.recursion;

/**
 * Finds the sum of digits of a +ve integer number
 */
public class SumOfDigits {
    public static void main(String[] args) {
        SumOfDigits sumOfDigits = new SumOfDigits();
        System.out.println(sumOfDigits.sum(-1031));
    }

    private int sum(int n) {
        if (n == 0 || n < 0) {
            return 0;
        }
        return n % 10 + sum(n / 10);
    }
}


