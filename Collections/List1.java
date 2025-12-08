package Collections;

import java.util.*;

public class List1 {
    public static void main(String[] args) {
        int first = 0,second=0,max;
        List<Integer> list = Arrays.asList(100000, 200000, 170000, 95000, 130000, 100000, 95000);
        List<Integer> uniqueList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!uniqueList.contains(list.get(i))) {
                uniqueList.add(list.get(i));
            }
        }
        for(Integer i:uniqueList){
            if(i>first){
                second=first;
                first=i;
            }else if(i>second){
                second=i;
            }
        }
        System.out.println("Unique sorted list: " + uniqueList);
        System.out.println("Highest value: " + second);
        System.out.println(Thread.activeCount());
    }
}
