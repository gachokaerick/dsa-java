package dsa.sort.heap;

import java.util.Arrays;
import java.util.Comparator;

public class HeapSort {
    public static <E> void heapSort(E[] list, Comparator<E> c) {
        Heap<E> heap;
        if (c != null) {
            heap = new Heap<>(c);
        } else {
            heap = new Heap<>();
        }

        heap.addElements(list);

        for (int i = list.length - 1; i >= 0; i--) {
            list[i] = heap.remove();
        }
    }

    public static void main(String[] args) {
        Integer[] list = {-44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53};
        heapSort(list, null);
        System.out.println("list = " + Arrays.toString(list));
    }
}
