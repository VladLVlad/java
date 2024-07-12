package lesson19.practice.practice7;

import java.util.HashMap;
import java.util.Map;

public class ToyDemo {
    public static void main(String[] args) {
        Map<String, Toy> toys = new HashMap<>();
        toys.put("Toy1", new Toy(2.2, 8.4));
        toys.put("Toy2", new Toy(1.2, 3.4));
        toys.put("Toy3", new Toy(3.2, 4.4));
        toys.put("Toy4", new Toy(7.2, 2.4));
        toys.put("Toy5", new Toy(5.2, 1.4));

        method1(toys);
        method2(toys);
        method3(toys);
    }
    public static void method1(Map<String, Toy> map){
        map.forEach((s, toy) -> System.out.println(s + " - " + toy));
    }
    public static void method2(Map<String, Toy> map){
        for (Map.Entry<String, Toy> m:
             map.entrySet()) {
            System.out.println(m.getKey());
        }
    }
    public static void method3(Map<String, Toy> map){
        map.forEach((s,toy) -> System.out.println(toy));
    }
}
