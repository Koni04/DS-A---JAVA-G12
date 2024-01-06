package DataStructure.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority {
    public static void main(String[]ags) {
        Queue<Integer> queue = new PriorityQueue<Integer>();


        queue.offer(2);
        queue.offer(3);
        queue.offer(5);
        queue.offer(1);
        queue.offer(4);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}