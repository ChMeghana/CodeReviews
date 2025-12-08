package org.example.strings;

public class ReverseString {
    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
    }
}
