package Collections;

import java.util.*;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,10,3,4,5));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(6,3,9,2));
        LinkedList<Integer> merge = new LinkedList<Integer>();
        merge.addAll(list);
        merge.addAll(list2);
        Collections.sort(merge);
        System.out.println(merge);
        }
    }

