package Collections;


import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        int elementToInsert = 0;

        ListIterator<Integer> it = list.listIterator();

        while (it.hasNext()) {
            int num = it.next();
            if (num % 2 == 0) {
                it.previous();
                it.add(elementToInsert);
                it.next();
            }
        }

        System.out.println(list);
    }
}
