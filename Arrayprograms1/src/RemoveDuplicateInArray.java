
    import java.util.Arrays;

    public class RemoveDuplicateInArray {

        public static int removeDuplicates(int[] arr, int n) {
            if (n == 0 || n == 1)
                return n;  // No duplicates possible for 0 or 1 element

            // Step 1: Sort array
            Arrays.sort(arr);

            // Step 2: Temporary array to store unique elements
            int[] temp = new int[n];
            int j = 0;

            // Step 3: Check each pair of adjacent elements
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    temp[j++] = arr[i];
                }
            }

            // Add the last element
            temp[j++] = arr[n - 1];

            // Step 4: Copy back to original array
            for (int i = 0; i < j; i++) {
                arr[i] = temp[i];
            }

            return j; // return length of new array
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 1, 4, 2, 1, 5};
            int n = arr.length;

            n = removeDuplicates(arr, n);

            System.out.print("Array without duplicates: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }


