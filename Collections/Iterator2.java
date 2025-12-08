package Collections;



import java.util.HashSet;
import java.util.Iterator;

public class Iterator2 {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(8);
        set.add(12);
        set.add(7);
        set.add(20);

        int sum = 0;
        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            int num = it.next();
            if (num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("Sum of even numbers: " + sum);
    }
}
