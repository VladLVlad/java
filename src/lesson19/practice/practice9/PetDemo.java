package lesson19.practice.practice9;

import java.util.HashMap;
import java.util.Map;

public class PetDemo {
    public static void main(String[] args) {
        Map<String, Pet> pets = new HashMap<>();
        pets.put("Name1", new Cat());
        pets.put("Name2", new Cat());
        pets.put("Name3", new Dog());
        pets.put("Name4", new Parrot());
        pets.put("Name5", new Parrot());

        for (Map.Entry<String,Pet> p:
             pets.entrySet()) {
            System.out.println(p.getKey());
        }
    }
}
