package org.example.collections;
import java.util.*;

// 10. Shuffle a List
public class ShuffleList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 5; i++) nums.add(i);

        Collections.shuffle(nums);
        System.out.println("Shuffled: " + nums);
    }
}