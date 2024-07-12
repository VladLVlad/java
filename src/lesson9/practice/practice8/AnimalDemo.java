package lesson9.practice.practice8;

public class AnimalDemo {
    public static void main(String[] args) {
        Vet vet = new Vet();
        Animal[] animals = new Animal[]{
                new Bear("Bear"),
                new Cat("Cat"),
                new Dog("Dog")
        };

        for (Animal a:
             animals) {
            vet.treatAnimal(a);
        }
    }

}
