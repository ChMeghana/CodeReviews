package collections;

import java.util.LinkedList;

public class MergeSortedLinkedLists {
    public static void main(String[] args) {
        // Create and fill two sorted linked lists
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);
        list1.add(5);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);

        // Merge them into a new sorted list
        LinkedList<Integer> merged = new LinkedList<>();

        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                merged.add(list1.get(i));
                i++;
            } else {
                merged.add(list2.get(j));
                j++;
            }
        }

        // Add any remaining elements
        while (i < list1.size()) {
            merged.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            merged.add(list2.get(j));
            j++;
        }

        // Print result
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Merged Sorted List: " + merged);
    }
}

