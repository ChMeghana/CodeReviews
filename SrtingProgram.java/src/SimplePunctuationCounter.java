public class SimplePunctuationCounter {


        public static void main(String[] args) {
            String input = "Hello, world! This is a test: Does it count punctuation ? Yes, it does.";

            int count = 0;

            // Iterate over each character
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                // Check if the character is a punctuation mark
                if (isPunctuation(ch)) {
                    count++;
                }
            }

            System.out.println("Total punctuation marks in the string: " + count);
        }

        // Helper method to check if a character is punctuation
        private static boolean isPunctuation(char ch) {
            // Consider basic punctuation characters
            String punctuations = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
            return punctuations.indexOf(ch) != -1;
        }
    }



