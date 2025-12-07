public class StringRotationCheck {


        // Method to check if two strings are rotations of each other
        public static boolean areRotations(String str1, String str2) {
            // Step 1: If lengths are not equal, they cannot be rotations
            if (str1 == null || str2 == null || str1.length() != str2.length()) {
                return false;
            }

            // Step 2: Concatenate the first string with itself
            String concatenated = str1 + str1;

            // Step 3: Check if str2 is a substring of the concatenated string
            return concatenated.contains(str2);
        }

        // Main method to test the logic
        public static void main(String[] args) {
            String s1 = "ABCD";
            String s2 = "CDAB";
            String s3 = "ACBD";

            System.out.println("\"" + s2 + "\" is rotation of \"" + s1 + "\": " + areRotations(s1, s2));
            System.out.println("\"" + s3 + "\" is rotation of \"" + s1 + "\": " + areRotations(s1, s3));
        }
    }


