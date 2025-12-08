package org.example.strings;

public class FreqOfChars {
    public static void printFrequency(String s) {
        int[] freq = new int[256];
        for (char c : s.toCharArray()) freq[c]++;
        for (int i = 0; i < 256; i++)
            if (freq[i] > 0) System.out.println((char)i + " -> " + freq[i]);
    }
    public static void main(String[] args) {
        printFrequency("Hello World");
    }
}
