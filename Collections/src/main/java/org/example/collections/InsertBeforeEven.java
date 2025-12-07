package org.example.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class InsertBeforeEven {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        ListIterator<Integer> itr = list.listIterator();

        // Insert -1 before every even number
        while (itr.hasNext()) {
            Integer num = itr.next();
            if (num % 2 == 0) {
                // Move iterator back so new value is inserted before the even number
                itr.previous();
                itr.add(-1); // You can replace -1 with any element you want to insert
                itr.next(); // Move iterator forward to continue after insertion
            }
        }

        System.out.println(list); // Output: [3, -1, 4, 5, -1, 6, 7]
    }
}
