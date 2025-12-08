package org.example.strings;
import java.io.*;
import java.util.*;

public class RepetitionWords {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        Map<String, Integer> map = new HashMap<>();
        String line;
        while ((line = br.readLine()) != null) {
            for (String w : line.toLowerCase().split("\\W+"))
                if (!w.isEmpty())
                    map.put(w, map.getOrDefault(w, 0) + 1);
        }
        br.close();
        String maxWord = null; int max = 0;
        for (Map.Entry<String, Integer> e : map.entrySet())
            if (e.getValue() > max) { max = e.getValue(); maxWord = e.getKey(); }
        System.out.println(maxWord + " -> " + max);
    }
}
