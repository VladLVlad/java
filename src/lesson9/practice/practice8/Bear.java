package lesson9.practice.practice8;

public class Bear extends Animal{

    public Bear(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return "UUUU!!!";
    }

    @Override
    public String eat() {
        return "meat, berries";
    }

    @Override
    public String getDescription() {
        return "bear's description";
    }
}
