package org.example.strings;

public class ReplaceSpaces {
    public static String replaceSpaces(String s, char ch) {
        return s.replace(' ', ch);
    }
    public static void main(String[] args) {
        System.out.println(replaceSpaces("Hello World Java", '-'));
    }
}
