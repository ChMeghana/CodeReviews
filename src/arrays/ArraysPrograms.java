package arrays;

public class ArraysPrograms {

    static void copyArray(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void frequency(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (arr[i] == -1) continue;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1;
                }
            }
            System.out.println(arr[i] + ": " + count);
        }
    }

    static void leftRotate(int[] arr) {
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void printDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void printReverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void printEvenPosition(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void printOddPosition(int[] arr) {
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void printLargest(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
        }
        System.out.println(max);
    }
    static void printSmallest(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) min = i;
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 5, 7, 9, 2};
        int[] arrCopy = new int[arr.length];

        System.out.println("Copy array:");
        copyArray(arr, arrCopy);

        System.out.println("Frequency of each:");
        frequency(arr.clone());

        System.out.println("Left rotate:");
        leftRotate(arr.clone());

        System.out.println("Duplicates:");
        printDuplicates(arr);

        System.out.println("Print all elements:");
        printArray(arr);

        System.out.println("Reverse order:");
        printReverse(arr);

        System.out.println("Even positions:");
        printEvenPosition(arr);

        System.out.println("Odd positions:");
        printOddPosition(arr);

        System.out.println("Largest element:");
        printLargest(arr);

        System.out.println("Smallest element:");
        printSmallest(arr);
    }
}
