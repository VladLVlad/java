package lesson19.examples.example3;

import lesson12.examples.example6.HeavyBox;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<HeavyBox> heavyBoxes = new ArrayList<>(
                List.of(
                        new HeavyBox(1,1,1,1),
                        new HeavyBox(2,2,2,2),
                        new HeavyBox(3,3,3,3)
                )
        );
        List<HeavyBox> addBoxes = new ArrayList<>();
        addBoxes.add(new HeavyBox(2.3,2.3,2.3,2.3));
        addBoxes.add(new HeavyBox(2.5,2.5,2.5,2.5));

        heavyBoxes.addAll(2,addBoxes);

        heavyBoxes.forEach(System.out::println);

        heavyBoxes.clear();
    }

}
