package org.example.collections;
import java.util.*;

//1. Sort a List in Ascending & Descending Order
public class SortList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5); nums.add(3); nums.add(8); nums.add(1); nums.add(2);

        Collections.sort(nums);
        System.out.println("Ascending: " + nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("Descending: " + nums);
    }
}