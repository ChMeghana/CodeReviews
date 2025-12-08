package org.example.strings;

public class ReverseWordByWord {
    public static String reverseWordByWord(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "Java is powerful and fun";
        System.out.println(reverseWordByWord(s));
    }
}
