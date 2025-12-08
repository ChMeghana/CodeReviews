package org.example.collections;
import java.util.*;

// 9. Convert List → TreeSet (Sorted)
public class ListToTreeSet {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5); nums.add(1); nums.add(3); nums.add(2); nums.add(4); nums.add(2);

        TreeSet<Integer> sorted = new TreeSet<>(nums);
        System.out.println("Sorted Unique: " + sorted);
    }
}
