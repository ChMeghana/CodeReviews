package org.example.collections;
import java.util.*;

// 12. Remove Odd Numbers
public class RemoveOdds {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 10; i++) nums.add(i);

        nums.removeIf(n -> n % 2 != 0);
        System.out.println("Even numbers: " + nums);
    }
}