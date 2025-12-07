
    import java.util.ArrayList;
import java.util.List;

    public class StringPermutations {

        // Recursive method to generate all permutations
        public static void permute(String str, String current, List<String> result) {
            // Base case: if no characters left to permute, add current string to results
            if (str.length() == 0) {
                result.add(current);
                return;
            }

            // Recursive case: for each character in the string, fix it and permute the rest
            for (int i = 0; i < str.length(); i++) {
                // Choose the character at index i
                char ch = str.charAt(i);
                // Remaining string without character at index i
                String rem = str.substring(0, i) + str.substring(i + 1);
                // Recurse with remaining string and current character added
                permute(rem, current + ch, result);
            }
        }

        public static void main(String[] args) {
            String input = "ABC";
            List<String> permutations = new ArrayList<>();
            permute(input, "", permutations);

            System.out.println("All permutations of " + input + ":");
            for (String s : permutations) {
                System.out.println(s);
            }
        }
    }


