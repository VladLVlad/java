package lesson9.practice.practice8;
/*makeNoise, eat, getDescription*/
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String makeNoise();
    public abstract String eat();
    public abstract String getDescription();

}
