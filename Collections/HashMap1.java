package Collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Collections;

import static java.util.Collections.sort;

public class HashMap1 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\ganes\\OneDrive\\Desktop\\PPT\\untitled2\\src\\Strings\\input.txt")
        );
        StringBuilder text = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            text.append(line).append(" ");
        }
        br.close();

        String[] words = text.toString().toLowerCase().split("\\W+");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            }else  {
                map.put(word, 1);
            }
        }
        for (String word : map.keySet()) {
            System.out.println(word + " " + map.get(word));
        }


    }
}
