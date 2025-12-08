package org.example.collections;
import java.util.*;

public class C5 {
    public static void main(String[] args) {
        String text = "this is a test this is only a test. told you this is a test and this is only a test but this is a test and also, this is only a test";
        String[] words = text.split(" ");
        Set<String> seen = new HashSet<>();
        String repeated = null;

        for (String w : words) {
            if (seen.contains(w)) {
                repeated = w;
                break;
            }
            seen.add(w);
        }
        System.out.println(seen);
        System.out.println("First repeated word: " + repeated);
    }
}
