package lesson19.examples.example9;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Double> doubleQueue = new LinkedList<>();
        Deque<String> stringDeque = new LinkedList<>();

        doubleQueue.add(3.4);
        doubleQueue.add(2.1);
        doubleQueue.add(6.5);
        doubleQueue.offer(5.4);
        doubleQueue.offer(4.4);



        Double test;
        while ((test = doubleQueue.poll()) != null){
            System.out.println(test);
        }

        stringDeque.addFirst("A");
        stringDeque.addFirst("B");
        stringDeque.addFirst("C");
        stringDeque.addFirst("D");



        String test2;

        while ((test2 = stringDeque.pollFirst()) != null){
            System.out.println(test2);
        }
    }
}
