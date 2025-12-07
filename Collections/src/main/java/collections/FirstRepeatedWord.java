package collections;

import java.util.HashSet;

public class FirstRepeatedWord {
    public static void main(String[] args) {
        String paragraph = "Hardships often prepare ordinary people for an extraordinary destiny. "
                + "Ordinary people overcome Hardships through courage and hope.";

        // Convert to lowercase and split into words
        String[] words = paragraph.toLowerCase().split("[\\s,.;:!?()]+");

        HashSet<String> seen = new HashSet<>();
        String repeated = null;

        // Loop through words
        for (String word : words) {
            if (seen.contains(word)) {
                repeated = word;
                break;  // Stop when first repeated word found
            } else {
                seen.add(word);
            }
        }

        if (repeated != null)
            System.out.println("First repeated word: " + repeated);
        else
            System.out.println("No repeated words found.");
    }
}
