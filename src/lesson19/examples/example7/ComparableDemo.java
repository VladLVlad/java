package lesson19.examples.example7;

import java.util.SortedSet;
import java.util.TreeSet;

public class ComparableDemo {
    public static void main(String[] args) {
        SortedSet<Phone> treeSet = new TreeSet<>();

        treeSet.add(new Phone("iphone", "12", 500));
        treeSet.add(new Phone("iphone", "15 pro max", 1000));
        treeSet.add(new Phone("Xiaomi", "redmi", 300));
        treeSet.add(new Phone("Samsung", "galaxy", 600));

        treeSet.forEach(System.out::println);
    }
}
