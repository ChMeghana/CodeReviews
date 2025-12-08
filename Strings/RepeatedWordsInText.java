import java.io.FileReader;
import java.io.BufferedReader;

public class RepeatedWordsInText {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\ganes\\OneDrive\\Desktop\\PPT\\untitled2\\src\\Strings\\input.txt")
        );
        StringBuilder text = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            text.append(line).append(" ");
        }
        br.close();

        String[] words = text.toString().toLowerCase().split("\\W+");
        String[] unique = new String[words.length];
        int[] count = new int[words.length];
        int uniqueCount = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("")) continue;
            int found = -1;
            for (int j = 0; j < uniqueCount; j++) {
                if (unique[j].equals(words[i])) {
                    found = j;
                    break;
                }
            }
            if (found != -1) count[found]++;
            else {
                unique[uniqueCount] = words[i];
                count[uniqueCount] = 1;
                uniqueCount++;
            }
        }

        int max = 0;
        String mostRepeated = "";
        for (int i = 0; i < uniqueCount; i++) {
            if (count[i] > max) {
                max = count[i];
                mostRepeated = unique[i];
            }
        }


        System.out.println("\nMost repeated word: " + mostRepeated);
        System.out.println("Count: " + max);
    }
}
