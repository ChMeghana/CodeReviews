package Collections;



import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("bat");
        list.add("cat");
        list.add("doge");
        list.add("hi");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String str = it.next();
            if (str.length() % 2 != 0) {
                it.remove();
            }
        }

        System.out.println(list);
    }
}
