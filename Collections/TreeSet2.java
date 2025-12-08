package Collections;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet(Arrays.asList(12000,11000,9800,14000,15700));
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(Integer o:treeSet){
            if(o==n){
                System.out.println(o+" seat is booked");
            }
        }
        Integer b= treeSet.higher(n);

        if(b!=null){
            System.out.println("Next available seat is " +b);
        }else System.out.println("No seats are available to book");
    }
}
