package lesson19.examples.example4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>(List.of(2.3, 4.5, 1.3, 2.3, 5.0, 6.0));
        List<Double> subList = new ArrayList<>(doubleList.subList(1, 3));
        List<Double> newDoubleList = new ArrayList<>(List.of(2.0, 5.0, 2.3));

        doubleList.retainAll(newDoubleList);

        doubleList.forEach(System.out::println);

        Double[] array1 = new Double[doubleList.size()];
        doubleList.toArray(array1);

        System.out.println(Arrays.toString(array1));

        Double[] array2 = doubleList.toArray(new Double[0]);
        System.out.println(Arrays.toString(array2));

        System.out.println(doubleList.indexOf(2.2));
        doubleList.listIterator();
        subList.forEach(s -> System.out.print(s + " "));
    }
}
