package dsa.test;

import dsa.graphs.WeightedEdge;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<WeightedEdge> list = new ArrayList<>();
        list.add(new WeightedEdge(1, 2, 3.5));
        list.add(new WeightedEdge(2, 3, 4.5));
        WeightedEdge e = java.util.Collections.max(list);
        System.out.println(e.u);
        System.out.println(e.v);
        System.out.println(e.weight);
    }
}
