package lesson9.practice.practice8;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return "GAV!!!";
    }

    @Override
    public String eat() {
        return "everything";
    }

    @Override
    public String getDescription() {
        return "dog's description";
    }
}
