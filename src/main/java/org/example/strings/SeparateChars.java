package org.example.strings;

public class SeparateChars {
    public static void separate(String s) {
        for (char c : s.toCharArray()) System.out.println(c);
    }
    public static void main(String[] args) {
        separate("Java");
    }
}
