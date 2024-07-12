package lesson9.examples.authorization;

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person("Vlad", "1234");
        System.out.println(person.getLogin());
        System.out.println(person.getPassword());
    }
}
