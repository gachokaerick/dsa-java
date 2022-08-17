package dsa.timecomplexity;

public class PrintArrayPairs {
    public static void main(String[] args) {
        PrintArrayPairs printArrayPairs = new PrintArrayPairs();
        int[] arr = {1, 3, 4, 5};
        printArrayPairs.printPairs(arr);
    }

    void printPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.println(arr[i] + ", " + arr[j]);
            }
        }
    }

}
