package lesson19.examples.example15;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(List.of(
                "A", "B", "C", "D", "F"
        ));
        ListIterator<String> listIterator = stringList.listIterator();
        while (listIterator.hasNext()){
            listIterator.set(listIterator.next().toLowerCase());
        }
        stringList.forEach(System.out::print);
        System.out.println();
        while (listIterator.hasPrevious()){
            String s;
            listIterator.set(s = (listIterator.previous().toUpperCase() + "+"));
            System.out.print(s);
        }
        System.out.println();
        stringList.forEach(System.out::print);

    }
}
