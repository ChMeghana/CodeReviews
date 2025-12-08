package org.example.collections;
import java.util.*;

// 13. Find Duplicates
public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1); nums.add(2); nums.add(2); nums.add(3); nums.add(4); nums.add(4); nums.add(5);

        Set<Integer> seen = new HashSet<>();
        Set<Integer> dupes = new HashSet<>();

        for (int n : nums) {
            if (!seen.add(n)) dupes.add(n);
        }
        System.out.println("Duplicates: " + dupes);
    }
}
