package collections;

import java.util.ArrayList;

public class UnionIntersectionList {
    public static void main(String[] args) {
        // Example lists
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();

        // Add elements
        A.add(1); A.add(2); A.add(3); A.add(4); A.add(89);
        B.add(3); B.add(4); B.add(5); B.add(6); B.add(112);

        // ===== UNION =====
        ArrayList<Integer> union = new ArrayList<>(A); // start with A
        for (Integer num : B) {
            if (!union.contains(num)) { // add only if not already there
                union.add(num);
            }
        }

        // ===== INTERSECTION =====
        ArrayList<Integer> intersection = new ArrayList<>();
        for (Integer num : A) {
            if (B.contains(num) && !intersection.contains(num)) {
                intersection.add(num);
            }
        }

        // Print results
        System.out.println("List A: " + A);
        System.out.println("List B: " + B);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}
