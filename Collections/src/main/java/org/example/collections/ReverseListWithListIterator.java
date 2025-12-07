package org.example.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ReverseListWithListIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // Get iterators at start and end
        ListIterator<String> forward = list.listIterator();
        ListIterator<String> backward = list.listIterator(list.size());

        int mid = list.size() / 2;
        for (int i = 0; i < mid; i++) {
            String front = forward.next();
            String back = backward.previous();

            // Swap
            forward.set(back);
            backward.set(front);
        }

        System.out.println(list); // Output: [E, D, C, B, A]
    }
}

