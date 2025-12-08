import java.util.*;

public class ex {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Integer> numbers = new ArrayList<>();

        // Populate list with 10,000 integers
        for (int i = 1; i <= 10000; i++) {
            numbers.add(i);
        }

        // Print even numbers using a for loop
        System.out.println("Even numbers using for loop:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("\nTime taken: " + (end - start) + " ms");
    }
}
