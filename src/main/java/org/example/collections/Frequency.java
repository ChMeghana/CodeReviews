package org.example.collections;
import java.util.*;

// 5. Frequency of Each Element
public class Frequency {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("apple"); items.add("banana"); items.add("apple");
        items.add("orange"); items.add("banana");

        Map<String, Integer> freq = new HashMap<>();
        for (String s : items) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }
        System.out.println(freq);
    }
}