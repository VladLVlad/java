package lesson19.examples.example8;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {
        PhoneComparator phoneComparator = new PhoneComparator();
        Comparator<Phone> phoneComparator2 = Comparator.comparing(Phone::getCost).
                thenComparing(Phone::getModel).thenComparing(Phone::getVersion);

        SortedSet<Phone> treeSet = new TreeSet<>(phoneComparator);
        SortedSet<Phone> treeSet2 = new TreeSet<>(phoneComparator2);


        treeSet.add(new Phone("iphone", "12", 500));
        treeSet.add(new Phone("iphone", "15 pro max", 1000));
        treeSet.add(new Phone("Xiaomi", "redmi", 300));
        treeSet.add(new Phone("Samsung", "galaxy", 600));
        treeSet.add(new Phone("Samsung", "galaxy", 500));

        treeSet2.add(new Phone("iphone", "12", 500));
        treeSet2.add(new Phone("iphone", "15 pro max", 1000));
        treeSet2.add(new Phone("Xiaomi", "redmi", 300));
        treeSet2.add(new Phone("Samsung", "galaxy", 600));
        treeSet2.add(new Phone("Samsung", "galaxy", 500));

        treeSet.forEach(System.out::println);
        System.out.println();
        treeSet2.forEach(System.out::println);
    }
}
