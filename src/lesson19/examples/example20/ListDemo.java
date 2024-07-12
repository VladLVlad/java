package lesson19.examples.example20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        List<String> list2 = new ArrayList<>(List.of("a", "x", "z"));

        list.set(0,"3");
        list2.set(0,"3");
        list2.add("5");
        //list.add("4"); error
        System.out.println(list);
        System.out.println(list2);
    }
}
