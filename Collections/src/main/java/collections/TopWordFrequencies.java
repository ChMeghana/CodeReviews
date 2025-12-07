package collections;

import java.io.*;
import java.util.*;

public class TopWordFrequencies {
    public static void main(String[] args) {
        String fileName = "data.txt";  // File path
        HashMap<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().split("[\\s,.;:!?()]+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        // Count word frequency
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Use a simple priority queue to get top 5
            PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                    (a, b) -> a.getValue() - b.getValue() // min-heap
            );

            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                pq.offer(entry);
                if (pq.size() > 5) pq.poll(); // Keep only top 5
            }

            // Extract top words in descending order
            List<Map.Entry<String, Integer>> topWords = new ArrayList<>();
            while (!pq.isEmpty()) topWords.add(pq.poll());
            Collections.reverse(topWords);

            System.out.println("Top 5 most frequent words:");
            for (Map.Entry<String, Integer> entry : topWords) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
