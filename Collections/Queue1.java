package Collections;

import java.util.*;
public class Queue1 {

    static class Node {
        int value;
        int arrayIndex;
        int elementIndex;

        Node(int value, int arrayIndex, int elementIndex) {
            this.value = value;
            this.arrayIndex = arrayIndex;
            this.elementIndex = elementIndex;
        }
    }

    public static List<Integer> merge(int[][] arrays) {
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(n -> n.value));
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].length > 0) {
                pq.add(new Node(arrays[i][0], i, 0));
            }
        }

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            result.add(node.value);

            int nextIndex = node.elementIndex + 1;

            if (nextIndex < arrays[node.arrayIndex].length) {
                pq.add(new Node(arrays[node.arrayIndex][nextIndex], node.arrayIndex, nextIndex));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] arrays = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };

        System.out.println(merge(arrays));
    }
}
