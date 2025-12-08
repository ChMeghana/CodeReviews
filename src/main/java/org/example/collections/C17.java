package org.example.collections;
import java.util.*;

public class C17 {
    public static void main(String[] args) {
        int[][] arrays = {{1,4,7},{2,5,8},{3,6,9}};
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < arrays.length; i++) pq.add(new int[]{arrays[i][0], i, 0});
        List<Integer> merged = new ArrayList<>();

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            merged.add(cur[0]);
            int arrIdx = cur[1], elemIdx = cur[2];
            if (elemIdx + 1 < arrays[arrIdx].length)
                pq.add(new int[]{arrays[arrIdx][elemIdx + 1], arrIdx, elemIdx + 1});
        }
        System.out.println(merged);
    }
}
