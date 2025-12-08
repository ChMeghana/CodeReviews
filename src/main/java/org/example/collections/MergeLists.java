package org.example.collections;
import java.util.*;

// 6. Merge Two Lists & Remove Duplicates
public class MergeLists {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1); l1.add(2); l1.add(3); l1.add(4);

        List<Integer> l2 = new ArrayList<>();
        l2.add(3); l2.add(4); l2.add(5); l2.add(6);

        Set<Integer> merged = new HashSet<>();
        merged.addAll(l1);
        merged.addAll(l2);

        System.out.println("Merged Unique: " + merged);
    }
}
