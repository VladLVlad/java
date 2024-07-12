package lesson19.examples.example11;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackAndQueue {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        Deque<String> queue = new ArrayDeque<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");
        while (!queue.isEmpty()){
            System.out.print(queue.remove() + " ");
        }
    }
}
