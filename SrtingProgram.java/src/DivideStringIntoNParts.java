public class DivideStringIntoNParts {


        // Method to divide string into N equal parts
        static void divideString(String str, int n) {
            int length = str.length();

            // Check if string length is divisible by n
            if (length % n != 0) {
                System.out.println("Invalid input: String length not divisible by " + n);
                return;
            }

            int partSize = length / n;

            System.out.println("Dividing the string into " + n + " parts:");

            for (int i = 0; i < length; i += partSize) {
                // Extract substring from current index with length partSize
                String part = str.substring(i, i + partSize);
                System.out.println(part);
            }
        }

        public static void main(String[] args) {
            String input = "abcdefghijklmno";
            int parts = 5;

            divideString(input, parts);
        }
    }


