package org.example.strings;

public class PalindromeWord {
    public static void find(String s) {
        String[] words = s.split("\\s+");
        String smallest = "", largest = "";
        for (String w : words) {
            String rev = new StringBuilder(w).reverse().toString();
            if (w.equalsIgnoreCase(rev)) {
                if (smallest.equals("") || w.length() < smallest.length()) smallest = w;
                if (largest.equals("") || w.length() > largest.length()) largest = w;
            }
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
    public static void main(String[] args) {
        find("madam level noon racecar civic kayak refer");
    }
}
