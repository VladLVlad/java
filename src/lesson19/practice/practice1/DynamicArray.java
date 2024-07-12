package lesson19.practice.practice1;

import lesson12.examples.example6.HeavyBox;

import java.util.ArrayList;
import java.util.List;

public class DynamicArray {
    public static void main(String[] args) {
        List<HeavyBox> list = new ArrayList<>();
        list.add(new HeavyBox(2,2,2,2));
        list.add(new HeavyBox(3,3,33,3));
        for (HeavyBox h:
             list) {
            System.out.println(h);
        }
        list.get(0).setHeight(list.get(0).getHeight() + 1);
        list.remove(list.size()-1);
        list.forEach(System.out::println);
        list.clear();
        System.out.println("after clear: " + list);
    }
}
