
    import java.util.Arrays;
import java.util.Scanner;

    public class AnagramCheckUsingStrings {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Taking two strings as input from the user
            System.out.print("Enter the first string: ");
            String str1 = scanner.nextLine();

            System.out.print("Enter the second string: ");
            String str2 = scanner.nextLine();

            // Normalize both strings: remove spaces and convert to lowercase
            str1 = str1.replaceAll("\\s", "").toLowerCase();
            str2 = str2.replaceAll("\\s", "").toLowerCase();

            // If lengths differ, they can’t be anagrams
            if (str1.length() != str2.length()) {
                System.out.println("Strings are not anagrams.");
            } else {
                // Convert strings to character arrays and sort them
                char[] arr1 = str1.toCharArray();
                char[] arr2 = str2.toCharArray();

                Arrays.sort(arr1);
                Arrays.sort(arr2);

                // Compare sorted strings
                if (Arrays.equals(arr1, arr2)) {
                    System.out.println("Strings are anagrams!");
                } else {
                    System.out.println("Strings are not anagrams.");
                }
            }

            scanner.close();
        }
    }


