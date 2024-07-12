package lesson9.practice.practice8;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return "Myau!!!";
    }

    @Override
    public String eat() {
        return "milk, fish";
    }

    @Override
    public String getDescription() {
        return "cat's description";
    }
}
