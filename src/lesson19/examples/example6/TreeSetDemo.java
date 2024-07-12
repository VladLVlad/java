package lesson19.examples.example6;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        SortedSet<String> treeSet = new TreeSet<>(List.of(
                "Hello", "Orange", "save", "Save", "apple"
        ));
        treeSet.forEach(System.out::println);
    }
}
