package org.example.arrays;
import java.util.*;

public class CopyElements {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2;
        int[] array3 = {1, 2, 3, 5, 6, 3, 4, 8, 3, 6, 1, 4, 0};

        for (int i = 0; i < array1.length; i++) {
            array1[i] = array3[i];
        }
        System.out.println(Arrays.toString(array1));

    }
}
