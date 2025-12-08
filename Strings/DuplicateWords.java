public class DuplicateWords {
    public static void main(String[] args) {
        String str = "Java is fun and Java is powerful";
        str = str.toLowerCase();
        String[] words = str.split("\\s+");

        System.out.print("Duplicate words: ");
        for (int i = 0; i < words.length; i++) {
            int count = 1;
            if (words[i].equals("")) continue;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "";
                }
            }
            if (count > 1)
                System.out.print(words[i] + " ");
        }
    }
}
