package org.example.strings;

public class AllPermutations {
    public static void permute(char[] arr, int l, int r) {
        if (l == r) {
            System.out.println(new String(arr));
        } else {
            for (int i = l; i <= r; i++) {
                swap(arr, l, i);
                permute(arr, l + 1, r);
                swap(arr, l, i);
            }
        }
    }
    private static void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void main(String[] args) {
        String s = "1234";
        permute(s.toCharArray(), 0, s.length() - 1);
    }
}
