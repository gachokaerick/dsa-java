package dsa.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialNum(10));
    }

    private static int factorialNum(int num) {
        if (num < 0) {
            return -1;
        }
        if (num == 0) {
            return 1;
        } else {
            return num * factorialNum(num - 1);
        }
    }
}
