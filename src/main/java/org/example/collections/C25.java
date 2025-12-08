package org.example.collections;
import java.util.*;

public class C25 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(7,1,5,9,3));
        Collections.sort(nums);
        int mid = nums.size()/2;
        System.out.println(nums.get(mid));
    }
}
