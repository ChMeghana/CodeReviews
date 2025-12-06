package arrays;

import java.util.Arrays;

public class ArraysPrograms2 {

    static void printNumberOfElements(int[] arr) {
        System.out.println("Number of elements: " + arr.length);
    }

    static void sumOfElements(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;
        System.out.println("Sum of elements: " + sum);
    }

    static void rightRotate(int[] arr) {
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        printArray(arr);
    }

    static void sortAscending(int[] arr) {
        Arrays.sort(arr);
        printArray(arr);
    }

    static void sortDescending(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        printArray(arr);
    }

    static void thirdLargest(int[] arr) {
        Arrays.sort(arr);
        if (arr.length < 3) System.out.println("Not enough elements.");
        else System.out.println(arr[arr.length - 3]);
    }

    static void secondLargest(int[] arr) {
        Arrays.sort(arr);
        if (arr.length < 2) System.out.println("Not enough elements.");
        else System.out.println(arr[arr.length - 2]);
    }

    static void largest(int[] arr) {
        int max = arr[0];
        for (int i : arr) if (i > max) max = i;
        System.out.println(max);
    }

    static void secondSmallest(int[] arr) {
        Arrays.sort(arr);
        if (arr.length < 2) System.out.println("Not enough elements.");
        else System.out.println(arr[1]);
    }

    static void smallest(int[] arr) {
        int min = arr[0];
        for (int i : arr) if (i < min) min = i;
        System.out.println(min);
    }

    static void removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) System.out.print(arr[i] + " ");
        }
        System.out.println(arr[arr.length - 1]);
    }

    static void printEvenAndOdd(int[] arr) {
        System.out.print("Even numbers: ");
        for (int i : arr) if (i % 2 == 0) System.out.print(i + " ");
        System.out.print("\nOdd numbers: ");
        for (int i : arr) if (i % 2 != 0) System.out.print(i + " ");
        System.out.println();
    }

    static void sortArrayExplanation() {
        System.out.println("Use Arrays.sort(array) to sort an array in Java.");
    }

    static void printArray(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 5, 7, 9, 2};

        System.out.println("Print number of elements:");
        printNumberOfElements(arr);

        System.out.println("\nSum of elements:");
        sumOfElements(arr);

        System.out.println("\nRight rotate:");
        rightRotate(arr);

        System.out.println("\nSort in ascending order:");
        sortAscending(arr);

        System.out.println("\nSort in descending order:");
        sortDescending(arr);

        System.out.println("\n3rd largest number:");
        thirdLargest(arr);

        System.out.println("\n2nd largest number:");
        secondLargest(arr);

        System.out.println("\nLargest number:");
        largest(arr);

        System.out.println("\n2nd smallest number:");
        secondSmallest(arr);

        System.out.println("\nSmallest number:");
        smallest(arr);

        System.out.println("\nRemove duplicate elements:");
        removeDuplicates(arr);

        System.out.println("\nPrint even and odd numbers:");
        printEvenAndOdd(arr);

        System.out.println("\nHow to sort an array:");
        sortArrayExplanation();
    }
}
