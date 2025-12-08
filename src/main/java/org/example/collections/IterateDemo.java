package org.example.collections;
import java.util.*;
// 14. Iterate with Iterator & ListIterator

public class IterateDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A"); list.add("B"); list.add("C");

        System.out.println("Forward:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) System.out.print(it.next() + " ");

        System.out.println("\nBackward:");
        ListIterator<String> lit = list.listIterator(list.size());
        while (lit.hasPrevious()) System.out.print(lit.previous() + " ");
    }
}