public class LongestRepeatingSequence {
    public static void main(String[] args) {
        String str = "AbDFAbdfh";
        str = str.toLowerCase();
        int n = str.length();
        String result = "";

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int k = 0;
                while (i + k < n && j + k < n && str.charAt(i + k) == str.charAt(j + k))
                    k++;
                if (k > result.length())
                    result = str.substring(i, i + k);
            }
        }

        System.out.println("Longest repeating substring: " + result);
    }

}
