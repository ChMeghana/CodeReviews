package org.example.strings;

public class RemoveSpaces {
    public static String removeSpaces(String s) {
        return s.replaceAll("\\s+", "");
    }
    public static void main(String[] args) {
        String s = "  Su sru tha Inu ga la  : )";
        System.out.println(removeSpaces(s));
    }
}
