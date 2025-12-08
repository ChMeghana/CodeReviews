package org.example.arrays;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {3, 1, 9, 4, 7};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
