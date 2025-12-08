package Collections;



import java.util.ArrayList;
import java.util.Collections;

public class Utility1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(5);
        list.add(8);
        list.add(3);
        list.add(10);

        Collections.sort(list);

        double median;
        int n = list.size();
        if (n % 2 == 1) {
            median = list.get(n / 2);
        } else {
            median = (list.get(n / 2 - 1) + list.get(n / 2)) / 2.0;
        }

        System.out.println("Median: " + median);
    }
}
