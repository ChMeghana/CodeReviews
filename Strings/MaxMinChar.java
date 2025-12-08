public class MaxMinChar {
    public static void main(String[] args) {
        String str = "hello world";
        int[] freq = new int[256];
        str = str.replace(" ", "").toLowerCase();

        for (int i = 0; i < str.length(); i++)
            freq[str.charAt(i)]++;


        char maxChar = ' ', minChar = ' ';
        int max = 0, min = Integer.MAX_VALUE;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                if (freq[i] > max) {
                    max = freq[i];
                    maxChar = (char) i;
                }
                if (freq[i] < min) {
                    min = freq[i];
                    minChar = (char) i;
                }
            }
        }

        System.out.println("Max occurring char: " + maxChar + " (" + max + ")");
        System.out.println("Min occurring char: " + minChar + " (" + min + ")");

    }
}
