package collections;

import java.util.TreeMap;
import java.util.Map;

public class SensorReadings {
    public static void main(String[] args) {
        // TreeMap to store timestamp -> sensor reading
        TreeMap<Long, Double> sensorData = new TreeMap<>();

        // Sample data (timestamp in milliseconds, reading as double)
        sensorData.put(1699000000000L, 23.5);
        sensorData.put(1699000005000L, 24.0);
        sensorData.put(1699000010000L, 23.8);
        sensorData.put(1699000015000L, 24.2);
        sensorData.put(1699000020000L, 23.9);

        // Define range of timestamps
        long startTime = 1699000005000L;
        long endTime = 1699000015000L;

        // Get readings in the range [startTime, endTime]
        // subMap(fromKey, toKey) -> fromKey inclusive, toKey exclusive
        Map<Long, Double> readingsInRange = sensorData.subMap(startTime, endTime + 1); // +1 to include endTime

        System.out.println("Sensor readings between " + startTime + " and " + endTime + ":");
        for (Map.Entry<Long, Double> entry : readingsInRange.entrySet()) {
            System.out.println("Timestamp: " + entry.getKey() + ", Reading: " + entry.getValue());
        }
    }
}

