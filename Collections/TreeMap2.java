package Collections;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap2 {
    public static void main(String[] args) {


        TreeMap<Integer, String> Data = new TreeMap<>();


        Data.put(90, "Ganesh");
        Data.put(80, "Mahindra");
        Data.put(95, "Venkat");
        Data.put(79, "Meghana");



        Integer startTime = 80;
        Integer endTime   = 95;


        SortedMap<Integer, String> rangeReadings =
                Data.subMap(startTime, true, endTime, false);


        System.out.println("Students marks between " + startTime + " and " + endTime + ":");
        for (Map.Entry<Integer, String> entry : rangeReadings.entrySet()) {
            System.out.println("Marks: " + entry.getKey() +
                    ", Student: " + entry.getValue());
        }
    }
}
