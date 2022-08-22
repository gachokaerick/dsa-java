package dsa.sort.quick;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 3, 8, 4, 0, 1, 6, 7};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(array, 0, array.length - 1);
        // System.out.println("array = " + Arrays.toString(array));
    }

    void quickSort(int[] arr, int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1) { // sort left half
            quickSort(arr, left, index - 1);
        }
        if (index < right) { // sort right half
            quickSort(arr, index, right);
        }
    }

    int partition(int[] arr, int left, int right) {
        int pivot = arr[(left + right) / 2]; // pick pivot point
        while (left <= right) {
            // Find element on left that should be on right
            while (arr[left] < pivot) left++;

            // Find element on right that should be on left
            while (arr[right] > pivot) right--;

            // Swap elements, and move left and right indices
            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left; // determines the start or last index of next subarray to sort
    }

    void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
