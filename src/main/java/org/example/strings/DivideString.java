package org.example.strings;

public class DivideString {
    public static String[] divide(String s, int n) {
        int len = s.length();
        int partSize = len/n;
        int rem = len%n;
        String[] parts = new String[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            int thisSize = partSize + (i < rem?1:0);
            parts[i] = s.substring(index, index + thisSize);
            index += thisSize;
        }
        return parts;
    }
    public static void main(String[] args) {
        String s = "abcdefghijk";
        String[] parts = divide(s, 3);
        for (String p : parts) {
            System.out.println(p);
        }
    }
}
