

    public class SmallestLargestWord {
        public static void main(String[] args) {
            String str = "Hardships often prepare ordinary people for an extraordinary destiny";

            str = str + " "; // Add space to handle the last word

            String word = "";
            String small = "";
            String large = "";

            int start = 0;

            // Find each word using indexOf and substring
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    word = str.substring(start, i);
                    start = i + 1;

                    if (small.isEmpty() || word.length() < small.length()) {
                        small = word;
                    }
                    if (large.isEmpty() || word.length() > large.length()) {
                        large = word;
                    }
                }
            }

            System.out.println("Smallest word: " + small);
            System.out.println("Largest word: " + large);
        }
    }
