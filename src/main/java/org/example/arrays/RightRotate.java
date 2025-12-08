package org.example.arrays;

public class RightRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        for (int i = arr.length - 1; i > d; i--){
            int last = arr[4];
            for (int j = arr.length - 1; j > 0; j--){
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        for (int v : arr) {
            System.out.print(v + " ");
        }
    }
}