package org.example.collections;
import java.util.*;

public class C23 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ListIterator<Integer> it = nums.listIterator();
        while (it.hasNext()) {
            int n = it.next();
            if (n % 2 == 0) it.previous();
            if (n % 2 == 0) { it.add(0); it.next(); }
        }
        System.out.println(nums);
    }
}
