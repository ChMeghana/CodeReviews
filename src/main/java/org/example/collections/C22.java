package org.example.collections;
import java.util.*;

public class C22 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(2,5,8,11,14));
        Iterator<Integer> it = set.iterator();
        int sum = 0;
        while (it.hasNext()) {
            int n = it.next();
            if (n % 2 == 0) sum += n;
        }
        System.out.println(sum);
    }
}
