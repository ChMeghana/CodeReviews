package Collections;

import java.util.*;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(Arrays.asList(12000,11000,9800,14000,15700));
        Set s=treeSet.subSet(10000,true,15000,true);
        for(Object o:s){
            System.out.println(o);
        }
    }
}
