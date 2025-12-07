package collections;

import java.util.*;

public class MarksRangeSearch {
    public static void main(String[] args) {
        // Create TreeMap: key = marks, value = student name
        TreeMap<Integer, String> marksMap = new TreeMap<>();

        // Add some students and their marks
        marksMap.put(75, "Alice");
        marksMap.put(82, "Bob");
        marksMap.put(91, "Charlie");
        marksMap.put(88, "David");
        marksMap.put(97, "Emma");
        marksMap.put(65, "Frank");

        // Define range of marks
        int startRange = 80;
        int endRange = 95;

        // subMap(fromKey, toKey) — fromKey inclusive, toKey exclusive
        Map<Integer, String> rangeMap = marksMap.subMap(startRange, true, endRange, true);

        System.out.println("Students scoring between " + startRange + " and " + endRange + ":");

        // Print the students in that range
        for (Map.Entry<Integer, String> entry : rangeMap.entrySet()) {
            System.out.println(entry.getValue() + " - " + entry.getKey());
        }
    }
}

