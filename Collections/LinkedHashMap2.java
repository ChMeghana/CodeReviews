package Collections;

import java.util.LinkedHashMap;

public class LinkedHashMap2<K, V> extends LinkedHashMap<K, V> {
    LinkedHashMap2() {
        super(5,0.75f, true);

    }
    public static void main(String[] args) {
        LinkedHashMap2<Integer, String> map = new LinkedHashMap2<>();
        map.put(1, "amazon.com/");
        map.put(2, "amazon.com/phones");
        map.put(3, "amazon.com/shoes");
        map.put(4, "amazon.com/shirts");
        map.put(5, "amazon.com/pants");
        System.out.println(map);
        map.get(2);
        map.get(3);

        System.out.println(map);



    }
}
