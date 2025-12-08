import java.util.HashSet;

public class Hashset1 {
    public static void main(String[] args) {
        String paragraph = "The sun was bright and the sky was blue. The sun warmed the river gently.";

        String[] words = paragraph.toLowerCase().split("\\W+");
        HashSet<String> seen = new HashSet<>();

        for (String word : words) {
            if (seen.contains(word)) {
                System.out.println("First repeated word: " + word);
                return;
            } else {
                seen.add(word);

            }
        }

        System.out.println("No repeated words found.");
    }
}
