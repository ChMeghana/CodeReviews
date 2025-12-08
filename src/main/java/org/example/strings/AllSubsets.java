package org.example.strings;

import java.util.ArrayList;
import java.util.List;

public class AllSubsets {
    public static List<String> subsets(String s) {
        List<String> res = new ArrayList<>();
        backtrack(s, 0, new StringBuilder(), res);
        return res;
    }
    private static void backtrack(String s, int idx, StringBuilder sb, List<String> res) {
        if (idx == s.length()) {
            res.add(sb.toString());
        } else {
            backtrack(s, idx + 1, sb, res);
            sb.append(s.charAt(idx));
            backtrack(s, idx + 1, sb, res);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        for (String sub : subsets(s)) {
            System.out.println(sub);
        }
    }
}
