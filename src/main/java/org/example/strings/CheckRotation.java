package org.example.strings;

public class CheckRotation {
    public static boolean isRotation(String s1, String s2) {
        return s1.length() == s2.length() && (s1 + s1).contains(s2);
    }
    public static void main(String[] args) {
        System.out.println(isRotation("abcd", "cdab"));
    }
}
