package org.example.collections;
import java.util.*;

// 7. Intersection of Two Sets
public class Intersection {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(1); s1.add(2); s1.add(3); s1.add(4);

        Set<Integer> s2 = new HashSet<>();
        s2.add(3); s2.add(4); s2.add(5); s2.add(6);

        s1.retainAll(s2);
        System.out.println("Intersection: " + s1);
    }
}
