package org.example.strings;

import java.util.*;

public class DuplicateWords {
    public static void printDuplicateWords(String s) {
        String[] words = s.toLowerCase().split("\\s+");
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String w : words) map.put(w, map.getOrDefault(w, 0) + 1);
        for (Map.Entry<String, Integer> e : map.entrySet())
            if (e.getValue() > 1)
                System.out.println(e.getKey() + " -> " + e.getValue());
    }
    public static void main(String[] args) {
        printDuplicateWords("Java is fun and Java is powerful");
    }
}
