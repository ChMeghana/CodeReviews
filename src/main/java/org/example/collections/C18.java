package org.example.collections;
import java.util.*;

public class C18 {
    public static void main(String[] args) {
        int[] stream = {5,10,3,20,15,8};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : stream) {
            minHeap.add(num);
            if (minHeap.size() > 3) minHeap.poll();
        }
        System.out.println(minHeap);
    }
}
