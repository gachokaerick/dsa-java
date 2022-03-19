package dsa.sort.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Heap<E> {
    private List<E> list = new ArrayList<>();
    private Comparator<? super E> c;

    public Heap() {
        this.c = (e1, e2) -> ((Comparable<E>) e1).compareTo(e2);
    }

    public Heap(Comparator<E> c) {
        this.c = c;
    }

    public void addElements(E[] elements) {
        this.c = (e1, e2) -> ((Comparable<E>) e1).compareTo(e2);
        for (int i = 0; i < elements.length; i++) {
            add(elements[i]);
        }
    }

    public void add(E element) {
        list.add(element);
        int currentIndex = list.size() - 1;
        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;
            if (c.compare(list.get(parentIndex), element) < 0) {
                E temp = list.get(parentIndex);
                list.set(parentIndex, element);
                list.set(currentIndex, temp);
                currentIndex = parentIndex;
            } else
                break;
        }
    }

    public E remove() {
        if (list.size() == 0) return null;
        E removed = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);

        int currentIndex = 0;
        while (currentIndex < list.size()) {
            int leftChildIndex = (2 * currentIndex) + 1;
            int rightChildIndex = (2 * currentIndex) + 2;
            if (leftChildIndex > list.size() - 1) {
                break;
            }

            int maxIndex = leftChildIndex;
            if (rightChildIndex < list.size()) {
                if (c.compare(list.get(leftChildIndex), list.get(rightChildIndex)) < 0) {
                    maxIndex = rightChildIndex;
                }
            }

            if (c.compare(list.get(currentIndex), list.get(maxIndex)) < 0) {
                E temp = list.get(maxIndex);
                list.set(maxIndex, list.get(currentIndex));
                list.set(currentIndex, temp);
                currentIndex = maxIndex;
            } else break;
        }
        return removed;
    }

    public int getSize() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

}
