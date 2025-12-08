package org.example.collections;
import java.util.*;

public class C24 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ListIterator<Integer> f = list.listIterator(list.size());
        ArrayList<Integer> rev = new ArrayList<>();
        while (f.hasPrevious()) rev.add(f.previous());
        System.out.println(rev);
    }
}
