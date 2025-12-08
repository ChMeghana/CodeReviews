package org.example.strings;

public class CaseChange {
    public static String swapCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c))
                sb.append(Character.toLowerCase(c));
            else if (Character.isLowerCase(c))
                sb.append(Character.toUpperCase(c));
            else sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(swapCase("HeLLo WoRLd"));
    }
}