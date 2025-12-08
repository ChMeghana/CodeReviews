package org.example.arrays;

public class PrintDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 3, 5, 1};
        boolean[] printed = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (printed[i]) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    printed[j] = true;
                }
            }
        }
    }
}
