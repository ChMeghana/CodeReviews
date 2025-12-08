package org.example.arrays;

public class SumOfElements {
        public static void main(String[] args) {
            int[] array3 = {1, 2, 3, 5, 6, 3, 4, 8, 3, 6, 1, 4, 0};
            int sum=0;
            for(int x: array3){
                sum=sum+x;
            }
            System.out.println("Sum of elements of the array: " + sum);
        }
}
