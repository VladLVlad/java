package lesson19.examples.example16;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        List<Person> listPerson = new ArrayList<>(List.of(
                new Person("Vlad", 22),
                new Person("Sergey", 32),
                new Person("Nikita", 55),
                new Person("Egor", 13),
                new Person("Ignat", 31)
        ));
        List<String> listJob = new ArrayList<>(List.of(
                "Teacher", "Doctor", "Dentist", "Designer", "Programmer"
        ));
        Comparator<Person> comparator = Comparator.comparing(Person::getAge);
        Map<Person, String> map = new HashMap<>(5);
        Map<Person, String> map2 = new LinkedHashMap<>(5);
        NavigableMap<Person, String> map3 = new TreeMap<>(comparator);


        if(listJob.size() == listPerson.size()){
            for (int i = 0; i < listPerson.size(); i++){
                map.put(listPerson.get(i), listJob.get(i));
                map2.put(listPerson.get(i), listJob.get(i));
                map3.put(listPerson.get(i), listJob.get(i));
            }

        }

        for (Map.Entry<Person, String> m:
             map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println();
        for (Map.Entry<Person, String> m:
                map2.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println();
        for (Map.Entry<Person, String> m:
                map3.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        if(map.containsKey(listPerson.get(2)) && map.containsValue(listJob.get(0))){
            System.out.println("!!!");
        }
    }
}
