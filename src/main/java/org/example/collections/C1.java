package org.example.collections;
import java.util.*;

public class C1 {
    public static void main(String[] args){
        List<Integer> salary = new ArrayList<>(Arrays.asList(5000, 7000, 5000, 9000, 7000, 12000, 9000));
        salary.add(4000);
        List<Integer> unique = new ArrayList<>();
        for(Integer s: salary) if(!unique.contains(s)) unique.add(s);
        Collections.sort(unique);
        System.out.println("Unique elements of the list: " +unique);
        System.out.println("Second highest salary is: " +unique.get(unique.size()-2));
    }
}