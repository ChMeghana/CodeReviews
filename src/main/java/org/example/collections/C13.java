package org.example.collections;
import java.util.*;

public class C13 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> cache = new LinkedHashMap<>(5, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, String> e) {
                return size() > 5;
            }
        };

        for (int i = 1; i <= 6; i++) cache.put(i, "Val" + i);
        System.out.println(cache);
    }
}
