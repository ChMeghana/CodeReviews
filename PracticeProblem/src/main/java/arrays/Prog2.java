package arrays;

public class Prog2 {
    public static void main(String[] args) {
        // Input array
        int[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        // Frequency array
        int[] fr = new int[arr.length];

        int visited = -1;

        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            int count = 1; // count for current element

            // Count frequency of arr[i]
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    fr[j] = visited; // mark as visited
                }
            }

            // If element is not visited, store its frequency
            if (fr[i] != visited)
                fr[i] = count;
        }

        // Display frequencies
        System.out.println("Element | Frequency");
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited)
                System.out.println("   " + arr[i] + "    |    " + fr[i]);
        }
    }
}
