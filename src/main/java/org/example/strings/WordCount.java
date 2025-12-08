package org.example.strings;

import java.io.*;

public class WordCount {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int count = 0;
        String line;
        while ((line = br.readLine()) != null)
            count += line.split("\\s+").length;
        br.close();
        System.out.println("Total words: " + count);
    }
}
