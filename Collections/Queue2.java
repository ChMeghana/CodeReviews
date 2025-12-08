package Collections;


import java.util.*;

public class Queue2 {

    private PriorityQueue<Integer> pq = new PriorityQueue<>();
    private int limit = 3;

    public void add(int num) {
        if (pq.size() < limit) {
            pq.add(num);
        } else if (num > pq.peek()) {
            pq.poll();
            pq.add(num);
        }
    }

    public List<Integer> getTop3() {
        List<Integer> list = new ArrayList<>(pq);
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }

    public static void main(String[] args) {
        Queue2 ts = new Queue2();

        int[] stream = {5, 1, 9, 3, 12, 7, 20, 2};

        for (int n : stream) {
            ts.add(n);
            System.out.println("Top 3 so far: " + ts.getTop3());
        }
    }
}
