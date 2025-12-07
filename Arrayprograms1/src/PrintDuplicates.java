
import java.util.*;
public class PrintDuplicates {




        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 2, 3, 5, 4, 5, 1};
            HashSet<Integer> seen = new HashSet<>();
            HashSet<Integer> duplicates = new HashSet<>();

            for (int num : arr) {
                if (!seen.add(num)) {
                    duplicates.add(num);
                }
            }

            if (!duplicates.isEmpty()) {
                System.out.println("Duplicate elements: " + duplicates);
            } else {
                System.out.println("No duplicates found");
            }
        }
    }


