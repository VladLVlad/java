package lesson19.practice.practice5;

import lesson12.examples.example6.HeavyBox;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<HeavyBox> heavyBoxDeque = new ArrayDeque<>();
        heavyBoxDeque.offer(new HeavyBox(1,1,1,1));
        heavyBoxDeque.offer(new HeavyBox(2,2,2,2));
        heavyBoxDeque.offer(new HeavyBox(3,3,3,3));
        while (heavyBoxDeque.size() > 0){
            System.out.println(heavyBoxDeque.poll());
        }
    }
}
