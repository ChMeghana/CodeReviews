package org.example.strings;

public class CountPunctuations {
    public static int countPunct(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "Hi! Well, How are you?";
        System.out.println(countPunct(s));
    }
}
