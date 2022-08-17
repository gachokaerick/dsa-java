package dsa.recursion;

public class Power {
    public static void main(String[] args) {
        Power power = new Power();
        int result = power.power(2, 2);
        System.out.println(result);
    }

    private int power(int base, int exp) {
        if (exp < 0) {
            return -1;
        }
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }
}
