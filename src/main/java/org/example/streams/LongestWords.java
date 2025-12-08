package org.example.streams;
import java.util.*;

public class LongestWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "grapes", "watermelon", "orange");

        String longest = words.stream()
                .max((a, b) -> Integer.compare(a.length(), b.length()))
                .orElse("");

        System.out.println("Longest word: " + longest);
    }
}
