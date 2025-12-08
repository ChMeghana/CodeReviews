package org.example.collections;
import java.util.*;

// 8. Union of Two Sets
public class Union {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(1); s1.add(2); s1.add(3);

        Set<Integer> s2 = new HashSet<>();
        s2.add(3); s2.add(4); s2.add(5);

        s1.addAll(s2);
        System.out.println("Union: " + s1);
    }
}
