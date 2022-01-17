package dsa.recursion;

public class DecimalToBinary {
    public static void main(String[] args) {
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        long result = decimalToBinary.decimalToBinary(10);
        System.out.println(result);
    }

    private long decimalToBinary(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 2 + 10 * decimalToBinary(n / 2);
    }
}
