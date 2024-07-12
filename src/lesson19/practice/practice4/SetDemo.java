package lesson19.practice.practice4;

import lesson12.examples.example6.HeavyBox;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(List.of(2, 5, 7, 1, 4));
        Set<Integer> set2 = new HashSet<>(List.of( 7, 1, 4, 3, 0));
        Set<Integer> resultSet = union(set,set2);
        for (Integer i:
             resultSet) {
            System.out.print(i + " ");
        }
        System.out.println();

        Set<HeavyBox> heavyBoxes = new HashSet<>(List.of(
                new HeavyBox(2,2,2,2),
                new HeavyBox(3,3,3,3)
        ));
        Set<HeavyBox> heavyBoxes2 = new HashSet<>(List.of(
                new HeavyBox(2,2,2,2),
                new HeavyBox(4,3,3,3)
        ));
        Set<HeavyBox> resultHeavyBoxes = union(heavyBoxes,heavyBoxes2);
        for (HeavyBox i:
                resultHeavyBoxes) {
            System.out.println(i + " ");
        }


        Set<Double> doubleSet = new HashSet<>(List.of(
                2.2, 3.3, 4.4, 5.5
        ));
        Set<Double> doubleSet2 = new HashSet<>(List.of(
                2.2, 3.3,  5.5
        ));
        Set<Double> doubleSet3 = new HashSet<>(List.of(
                2.2, 3.3, 3.5, 3.6
        ));
        Set<Double> resultDouble = intersect(doubleSet, doubleSet2, doubleSet3);
        Set<Double> resultDouble2 = intersect();
        for (Double d:
             resultDouble) {
            System.out.print(d + " ");
        }
        for (Double d:
                resultDouble2) {
            System.out.print(d + " ");
        }

    }

    @SafeVarargs
    public static <T> Set<T> union(Set<? extends T> ... sets) {
        Set<T> newSet = new HashSet<>();
        for (Set<? extends T> s:
             sets) {
            newSet.addAll(s);
        }
        return newSet;
    }

    @SafeVarargs
    public static <T> Set<T> intersect(Set<? extends T> ... sets){
        if (sets.length == 0) {
            return Collections.emptySet();
        }

        Set<T> newSet = new HashSet<>(sets[0]);
        for (Set<? extends T> s:
                sets) {
            newSet.retainAll(s);
        }
        return newSet;
    }
}
