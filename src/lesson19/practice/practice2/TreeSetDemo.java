package lesson19.practice.practice2;

import lesson12.examples.example6.HeavyBox;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<HeavyBox> set = new TreeSet<>();
        set.add(new HeavyBox(1,1,1,6));
        set.add(new HeavyBox(3,1,1,6));
        set.add(new HeavyBox(2,1,1,2));
        set.forEach(System.out::println);
    }
}
