package lesson19.examples.example5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Phone> phones = new HashSet<>(
                List.of(
                        new Phone("iPhone", "pro max 12", 700),
                        new Phone("iPhone", "14", 800),
                        new Phone("Samsung", "galaxy", 650)
                )
        );
        phones.add(new Phone("Xiaomi", "redmi note 35", 450));

        Set<Phone> phones2 = new LinkedHashSet<>(
                List.of(
                        new Phone("iPhone", "pro max 12", 700),
                        new Phone("iPhone", "14", 800),
                        new Phone("Samsung", "galaxy", 650)
                )
        );
        phones2.add(new Phone("Xiaomi", "redmi note 35", 450));

        phones.forEach(System.out::println);
        System.out.println();
        phones2.forEach(System.out::println);

    }
}
