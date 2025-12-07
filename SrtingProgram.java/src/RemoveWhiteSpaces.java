public class RemoveWhiteSpaces {

        public static void main(String[] args) {
            String original = "Java  programming   is Hard part in the world!";

            // Remove all white spaces (spaces, tabs, newlines)
            String noSpaces = original.replaceAll("\\s+", "");

            System.out.println("Original String: \"" + original + "\"");
            System.out.println("String without white spaces: \"" + noSpaces + "\"");
        }
    }


