package org.example.collections;
import java.util.*;

public class C6 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (char c : s1.toCharArray()) set1.add(c);
        for (char c : s2.toCharArray()) set2.add(c);

        boolean isAnagram = set1.equals(set2);
        System.out.println("Are they anagrams (by character set)? " + isAnagram);
    }
}
