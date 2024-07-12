package lesson18.examples.predicate;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateDemo {


    public static void main(String[] args) {
        Predicate<String> predicate = Objects::nonNull;
        Predicate<String> predicate2 = str -> !str.isEmpty();
        Predicate<String> predicate3 = predicate.and(predicate2);
        Predicate<String> predicate4 = predicate.or(predicate2);
        System.out.println(predicate3.test(null));
        System.out.println(predicate3.test(""));
        System.out.println(predicate3.test("rr"));
        //System.out.println(predicate4.test(null));
        System.out.println(predicate4.test(""));
        System.out.println(predicate4.test("rr"));
    }
}
