package DataStructure.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String []args) {
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Koni");
        queue.offer("Mist");
        queue.offer("Hakdog");
        queue.offer("Alex");
        queue.offer("Niux");

        System.out.println(queue);
        System.out.println(queue.size());


    }
}
