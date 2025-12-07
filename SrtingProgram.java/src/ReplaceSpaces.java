public class ReplaceSpaces {

        public static void main(String[] args) {
            String original = "Java programming is fun";
            char replacementChar = '@';

            // Replace all spaces with the specified character
            String modified = original.replace(' ', replacementChar);

            System.out.println("Original String: " + original);
            System.out.println("Modified String: " + modified);
        }
    }


