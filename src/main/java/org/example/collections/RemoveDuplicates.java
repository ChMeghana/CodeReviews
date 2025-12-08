package org.example.collections;
import java.util.*;

// 2. Remove Duplicates from List using Set
public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1); nums.add(2); nums.add(2); nums.add(3); nums.add(4); nums.add(4); nums.add(5);

        Set<Integer> unique = new HashSet<>(nums);
        System.out.println("Without duplicates: " + unique);
    }
}