package collections;
import java.util.ArrayList;
import java.util.Collections;

public class SecondHighestSalary {
    public static void main(String[] args) {
        // Example list of salaries (with duplicates)
        int[] salaries = {50000, 60000, 55000, 60000, 75000, 50000, 80000,987650};

        // Step 1: Store unique salaries (without using Set)
        ArrayList<Integer> unique = new ArrayList<>();

        for (int sal : salaries) {
            if (!unique.contains(sal)) {
                unique.add(sal);
            }
        }

        // Step 2: Sort the unique salaries in descending order
        Collections.sort(unique, Collections.reverseOrder());

        // Step 3: Find the second highest
        if (unique.size() >= 2) {
            int secondHighest = unique.get(1);
            System.out.println("Second highest salary: " + secondHighest);
        } else {
            System.out.println("Not enough unique salaries.");
        }
    }
}
