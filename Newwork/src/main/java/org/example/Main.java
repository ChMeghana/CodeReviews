package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 List<Integer>l1=new ArrayList<>();
 l1.add(1);l1.add(2);l1.add(3);
 List<Integer>l2=new ArrayList<>();
 l2.add(10);l2.add(20);l2.add(15);

 Set<Integer>set=new HashSet<>();
 set.addAll(l1);
 set.addAll(l2);
 System.out.println(set);
    }
}
