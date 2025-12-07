public class AllSubsetsOfString {


        // Method to print all subsets of a string
        public static void printAllSubsets(String str) {
            int n = str.length();
            int totalSubsets = 1 << n; // 2^n subsets

            System.out.println("All subsets of \"" + str + "\" are:");

            // Loop from 0 to 2^n - 1
            for (int i = 0; i < totalSubsets; i++) {
                StringBuilder subset = new StringBuilder();

                // Check each bit position
                for (int j = 0; j < n; j++) {
                    // If j-th bit in i is set, include str.charAt(j)
                    if ((i & (1 << j)) != 0) {
                        subset.append(str.charAt(j));
                    }
                }
                System.out.println(subset.toString());
            }
        }

        public static void main(String[] args) {
            String input = "abc";
            printAllSubsets(input);
        }
    }


