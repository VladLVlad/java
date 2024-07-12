package lesson18.examples.consumer;

import lesson12.examples.example6.HeavyBox;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<HeavyBox> consumer = heavyBox -> System.out.println("Take box with weight: " + heavyBox.getWeight());
        Consumer<HeavyBox> consumer2 = heavyBox -> System.out.println("Send box with weight: " + heavyBox.getWeight());
        Consumer<HeavyBox> consumer3 = System.out::println;
        HeavyBox heavyBox = new HeavyBox(2.1, 1.5, 1.0, 2.67);

        consumer.andThen(consumer2).accept(heavyBox);
        consumer3.accept(heavyBox);
    }
}
