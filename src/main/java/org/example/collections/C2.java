package org.example.collections;
import java.util.*;


public class C2 {
    public static void main(String[] args){
        List<Integer> A = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> B = new ArrayList<>(Arrays.asList(4,5,6,7,8));

        List<Integer> union = new ArrayList<>(A);
        for(Integer n: B) if(!union.contains(n)) union.add(n);

        List<Integer> intersection = new ArrayList<>();
        for(Integer n: A) if(B.contains(n)) intersection.add(n);

        System.out.println("Union of A and B: "+union);
        System.out.println("Intersection of A and B: "+intersection);
    }
}
