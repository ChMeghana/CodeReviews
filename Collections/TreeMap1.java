import java.util.*;

public class TreeMap1 {
    public static void main(String[] args) {


        TreeMap<Long, Double> sensorData = new TreeMap<>();


        sensorData.put(1000L, 25.5);
        sensorData.put(1500L, 26.1);
        sensorData.put(2000L, 27.3);
        sensorData.put(2500L, 28.0);
        sensorData.put(3000L, 28.5);


        long startTime = 1500L;
        long endTime   = 2500L;


        SortedMap<Long, Double> rangeReadings =
                sensorData.subMap(startTime, true, endTime, true);


        System.out.println("Sensor readings between " + startTime + " and " + endTime + ":");
        for (Map.Entry<Long, Double> entry : rangeReadings.entrySet()) {
            System.out.println("Timestamp: " + entry.getKey() +
                    ", Reading: " + entry.getValue());
        }
    }
}
