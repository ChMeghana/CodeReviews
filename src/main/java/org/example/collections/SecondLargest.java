package org.example.collections;
import java.util.*;
// 3. Find Second-Largest Element
import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(10); nums.add(20); nums.add(5); nums.add(30); nums.add(25);

        TreeSet<Integer> set = new TreeSet<>(nums);
        System.out.println("Second Largest: " + set.lower(set.last()));
    }
}