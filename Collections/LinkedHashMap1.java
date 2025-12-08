package Collections;


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1<K, V> extends LinkedHashMap<K, V> {

    private final int maxSize;

    public LinkedHashMap1(int maxSize) {
        super(maxSize, 0.75f, true);
        this.maxSize = maxSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > maxSize;
    }

    public static void main(String[] args) {
        LinkedHashMap1<Integer, String> cache = new LinkedHashMap1<>(5);

        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");
        cache.put(4, "D");
        cache.put(5, "E");

        System.out.println(cache);

        cache.get(2);
        cache.get(4);

        cache.put(6, "F");
        System.out.println(cache);

        cache.put(7, "G");
        System.out.println(cache);
    }
}
