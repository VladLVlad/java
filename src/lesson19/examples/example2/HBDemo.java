package lesson19.examples.example2;

import lesson12.examples.example6.HeavyBox;

import java.util.ArrayList;
import java.util.List;

public class HBDemo {
    public static void main(String[] args) {
        List<HeavyBox> heavyBoxes = new ArrayList<>(List.of(
                new HeavyBox(2, 1, 0.5, 3.4),
                new HeavyBox(2.2, 1.2, 0.7, 3.6),
                new HeavyBox(4, 2, 0.2, 3.8),
                new HeavyBox(6, 3.5, 0.9, 8)
        ));
        for (HeavyBox h :
                heavyBoxes) {
            System.out.println(h);
        }
        heavyBoxes.get(0).setWeight(heavyBoxes.get(0).getWeight() + 1);
        heavyBoxes.remove(heavyBoxes.size() - 1);

        System.out.println();
        heavyBoxes.forEach(System.out::println);
    }
}
