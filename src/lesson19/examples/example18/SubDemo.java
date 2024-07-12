package lesson19.examples.example18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> subList = list.subList(2, 5);
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> unmodifiableList = Collections.unmodifiableList(list2);

        System.out.println("Original list: " + list);
        System.out.println("Sublist: " + subList);

        subList.set(0, 99);
        System.out.println("After change:");
        System.out.println("Original list: " + list);
        System.out.println("Sublist: " + subList);

        System.out.println();

        System.out.println("Original list: " + list2);
        System.out.println("Sublist: " + unmodifiableList);

        list2.set(0, 99);
        System.out.println("After change:");
        System.out.println("Original list: " + list2);
        System.out.println("Sublist: " + unmodifiableList);
    }
}

