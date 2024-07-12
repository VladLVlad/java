package lesson19.examples.example17;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("red", "blue", "green");
        System.out.println("Before sorted: " + list);
        Collections.sort(list);
        System.out.println("After sorted: " + list);
        list.sort(Collections.reverseOrder());
        System.out.println("After back sorted: " + list);
        System.out.println(Collections.binarySearch(list, "red"));
        System.out.println(Collections.binarySearch(list, "black"));
        Collections.shuffle(list);
        System.out.println("After shuffling: " + list);
    }
}
