import java.util.ArrayList;
import java.util.Collections;

public class MedianFinder {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(3);

        // Sort the list
        Collections.sort(list);

        System.out.println("Sorted List: " + list);

        double median;
        int size = list.size();

        if (size % 2 == 1) {
            // Odd number of elements → middle element
            median = list.get(size / 2);
        } else {
            // Even number of elements → average of two middle elements
            int mid1 = list.get(size / 2 - 1);
            int mid2 = list.get(size / 2);
            median = (mid1 + mid2) / 2.0;  // use double
        }

        System.out.println("Median = " + median);
    }
}
