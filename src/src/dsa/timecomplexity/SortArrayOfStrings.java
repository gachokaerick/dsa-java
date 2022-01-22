package dsa.timecomplexity;

import java.util.Arrays;

// time complexity is O(a*s(log a + log s))
// where s = the length of the longest string
// and a = length of array
public class SortArrayOfStrings {
    public static void main(String[] args) {
        SortArrayOfStrings sort = new SortArrayOfStrings();
        String[] array = {"gachoka", "erick", "mwangi"};
        sort.sortArray(array);
        System.out.println("array = " + Arrays.toString(array));
    }

    void sortArray(String[] array) {
        for (int i = 0; i < array.length; i++) { // a
            array[i] = sortString(array[i]); // O(s log s)
        } // O(a*s log s)

        Arrays.sort(array); // You need
        // to compare the strings. Each string comparison takes O(s) time.
        // There are O(a log a) comparisons,
        // therefore this will take O(a*s log a) time.

        // total runtime = O(a*s log s) + O(a*s log a) = O(a*s(log a + log s))
    }

    String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars); // O(s log s)
        return new String(chars);
    }
}
