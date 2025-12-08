package org.example.strings;

public class Repetition {
    public static void findMaxMin(String s) {
        int[] freq = new int[256];
        for (char c : s.toCharArray()) freq[c]++;
        int max = 0, min = Integer.MAX_VALUE;
        char maxChar = 0, minChar = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                if (freq[i] > max) { max = freq[i]; maxChar = (char)i; }
                if (freq[i] < min) { min = freq[i]; minChar = (char)i; }
            }
        }
        System.out.println("Max: " + maxChar + ", Min: " + minChar);
    }
    public static void main(String[] args) {
        findMaxMin("successes");
    }
}
