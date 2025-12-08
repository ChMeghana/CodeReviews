package org.example.collections;
import java.util.*;

public class C4 {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 3, 5, 7, 9));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(0, 1, 2, 4, 6, 8, 10));
        LinkedList<Integer> merged = new LinkedList<>();

        while (!list1.isEmpty() && !list2.isEmpty()) {
            if (list1.peekFirst() <= list2.peekFirst()) {
                merged.add(list1.removeFirst());
            } else {
                merged.add(list2.removeFirst());
            }
        }
        merged.addAll(list1);
        merged.addAll(list2);

        System.out.println("Merged Sorted List: " + merged);
    }
}
