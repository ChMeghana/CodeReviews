package org.example.collections;
import java.util.*;

public class C12 {
    public static void main(String[] args) {
        TreeMap<Integer, String> marks = new TreeMap<>();
        marks.put(75, "A");
        marks.put(82, "B");
        marks.put(90, "C");
        marks.put(96, "D");

        System.out.println(marks.subMap(80, true, 95, true));
    }
}
