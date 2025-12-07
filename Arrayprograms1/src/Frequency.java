public class Frequency {

    public static void main(String[] args) {
        String str = "welcome";

        // Frequency array for ASCII characters (total 256)
        int[] freq = new int[256];

        // Traverse string and increment frequency
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        System.out.println("Character frequencies in the string:");

        // Print characters and their frequencies
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " - " + freq[i]);
            }
        }
    }
}


