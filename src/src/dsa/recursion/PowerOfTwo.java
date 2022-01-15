package dsa.recursion;

public class PowerOfTwo {
    public static int powerOfTwoRecursive(int n) {
        if (n == 1) {
            return 2;
        } else {
            return 2 * powerOfTwoRecursive(n - 1);
        }
    }

    public static int powerOfTwoIterative(int n) {
        int i = 0;
        int power = 1;
        while (i < n) {
            power = power * 2;
            i = i + 1;
        }
        return power;
    }

    public static void main(String[] args) {
        System.out.println(powerOfTwoRecursive(5));
        System.out.println(powerOfTwoIterative(5));
    }
}
