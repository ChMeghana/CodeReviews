package org.example.strings;

public class MinMaxWords {
    public static void findWords(String s) {
        String[] words = s.split("\\s+");
        String smallest = words[0], largest = words[0];
        for (String w : words) {
            if (w.length() < smallest.length()) smallest = w;
            if (w.length() > largest.length()) largest = w;
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
    public static void main(String[] args) {
        findWords("Java is very powerful and elegant");
    }
}
