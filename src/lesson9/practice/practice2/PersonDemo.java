package lesson9.practice.practice2;

public class PersonDemo {
    public static void main(String[] args) {
        Person [] people = new Person[]{new Person("Ivanov A. A.", 22), new Person()};
        for (Person p:
             people) {
            p.talk();
        }
    }
}
