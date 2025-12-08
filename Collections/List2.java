package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class List2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> list2 = Arrays.asList(1,2,3,4,5);
        List<Integer> Union=new ArrayList<>(list);
        List<Integer> Intersection=new ArrayList<>(list);
        Union.addAll(list2);
        Intersection.retainAll(list2);
        System.out.println(Union);
        System.out.println(Intersection);
    }
}
