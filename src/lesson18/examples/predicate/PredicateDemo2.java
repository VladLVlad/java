package lesson18.examples.predicate;

import java.util.function.Predicate;

public class PredicateDemo2 {
    public static void main(String[] args) {
        Predicate<String> predicate1 = str -> str.startsWith("J");
        Predicate<String> predicate2 = str -> str.startsWith("N");
        Predicate<String> predicate3 = str -> str.endsWith("A");
        Predicate<String> predicate = predicate1.or(predicate2).and(predicate3);
        System.out.println(predicate.test("J akc A"));
        System.out.println(predicate.test("N akc A"));
        System.out.println(predicate.test("N akc "));
        System.out.println(predicate.test("J akc "));
        System.out.println(predicate.test(" akc A"));
    }
}
