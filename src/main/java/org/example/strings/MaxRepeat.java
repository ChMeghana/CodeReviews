package org.example.strings;

public class MaxRepeat {
    public static String maxRepeat(String s) {
        int maxLen = 1;
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substr = s.substring(i, j);
                int len = substr.length();
                if (len <= maxLen) continue;
                int count = 0;
                int idx = 0;
                while ((idx = s.indexOf(substr, idx)) != -1) {
                    count++;
                    idx += 1;
                }
                if (count > 1 && len > maxLen) {
                    maxLen = len;
                    res = substr;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(maxRepeat("Can you can a can as a canner can can a can?"));
    }
}
