package lesson19.examples.example1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(20);
        List<String> removeList = new ArrayList<>(List.of("B", "F", "C"));

        System.out.println(removeList);
        System.out.println("arrayList size: " + arrayList.size());

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("F");

        System.out.println("arrayList size: " + arrayList.size());
        System.out.println("ArrayList: " + arrayList);

        arrayList.add(1, "A-B");

        System.out.println("arrayList size: " + arrayList.size());
        System.out.println("ArrayList: " + arrayList);

        arrayList.set(5, "F2");

        System.out.println("arrayList size: " + arrayList.size());
        System.out.println("ArrayList: " + arrayList);

        arrayList.removeAll(removeList);

        System.out.println("arrayList size: " + arrayList.size());
        System.out.println("ArrayList: " + arrayList);
    }
}
