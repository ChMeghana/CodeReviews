package org.example.collections;
import java.util.*;

// 11. Find Min & Max (no sorting)
public class MinMax {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(10); nums.add(20); nums.add(5); nums.add(30); nums.add(15);

        int min = Collections.min(nums);
        int max = Collections.max(nums);

        System.out.println("Min: " + min + ", Max: " + max);
    }
}

