package org.example.collections;
import java.util.*;
// 4. Reverse a List (without Collections.reverse())
import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) list.add(i);

        for (int i = 0, j = list.size()-1; i < j; i++, j--) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
        System.out.println("Reversed: " + list);
    }
}