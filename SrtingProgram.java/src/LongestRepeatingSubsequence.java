

    public class LongestRepeatingSubsequence {

        // Method to find length of longest repeating subsequence
        public static int longestRepeatingSubsequence(String str) {
            int n = str.length();
            int[][] dp = new int[n + 1][n + 1];

            // Build the dp table in bottom-up manner
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    // If characters match and indexes are not same
                    if (str.charAt(i - 1) == str.charAt(j - 1) && i != j) {
                        dp[i][j] = 1 + dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }
            // dp[n][n] contains the length of the longest repeating subsequence
            return dp[n][n];
        }

        public static void main(String[] args) {
            String str = "AABEBCDDHHJJ";
            int result = longestRepeatingSubsequence(str);
            System.out.println("Length of Longest Repeating Subsequence: " + result);
        }
    }


