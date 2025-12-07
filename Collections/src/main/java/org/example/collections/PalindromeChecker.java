package org.example.collections;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        // Add characters to deque using Collections API
        for (char c : str.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            char first = deque.pollFirst();
            char last = deque.pollLast();
            if (!firstEqualsLast(first, last)) { // Helper for clarity, could just use (first != last)
                return false;
            }
        }
        return true;
    }

    private static boolean firstEqualsLast(char a, char b) {
        return a == b;
    }

    public static void main(String[] args) {
        String test = "racecar";
        System.out.println(isPalindrome(test));  // Output: true
        System.out.println(isPalindrome("hello")); // Output: false
    }
}

