package org.example.arrays;

public class PrintEvenPosition {
    public static void main(String[] args) {
        int[] arr = {10, 11, 12, 13, 14, 15};
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
