package Collections;


import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ListIterator<Integer> forward = list.listIterator();
        ListIterator<Integer> backward = list.listIterator(list.size());

        int count = list.size() / 2;
        for (int i = 0; i < count; i++) {
            int front = forward.next();
            int back = backward.previous();
            forward.set(back);
            backward.set(front);
        }

        System.out.println(list);
    }
}
