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
        for (int i = 0; i < array.length; i++) {
            array[i] = sortString(array[i]);
        }
        Arrays.sort(array);
    }

    String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
