import java.io.*;
import java.util.*;

public class MostRepeatedWord {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String line;
        ArrayList<String> words = new ArrayList<>();

        // Read all lines and split into words
        while ((line = br.readLine()) != null) {
            String[] parts = line.toLowerCase().split("[\\s,.;!?]+");
            for (String w : parts) {
                if (!w.isEmpty()) {
                    words.add(w);
                }
            }
        }
        br.close();

        // Find the most repeated word
        String mostRepeated = "";
        int maxCount = 0;

        for (String w : words) {
            int count = Collections.frequency(words, w);
            if (count > maxCount) {
                maxCount = count;
                mostRepeated = w;
            }
        }

        System.out.println("Most repeated word: " + mostRepeated);
        System.out.println("Count: " + maxCount);
    }
}
