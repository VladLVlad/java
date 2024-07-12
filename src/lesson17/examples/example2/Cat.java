package lesson17.examples.example2;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
