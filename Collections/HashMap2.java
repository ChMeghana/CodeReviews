package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class HashMap2 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Laptop", 50);
        map.put("phone", 8);
        map.put("tablet", 5);
        map.put("iPhone", 50);
        map.put("Ear phones", 25);

        map.entrySet().removeIf(entry -> entry.getValue() <10);


        System.out.println(map);
    }
}
