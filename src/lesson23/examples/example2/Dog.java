package lesson23.examples.example2;

import java.io.Serializable;
import java.util.Objects;

public class Dog implements Serializable {
    private final Collar theCollar;

    public Dog(Collar collar) {
        theCollar = collar;
    }

    public Collar getCollar() {
        return theCollar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        return Objects.equals(theCollar, dog.theCollar);

    }

    @Override
    public int hashCode() {
        return theCollar != null ? theCollar.hashCode() : 0;
    }
}
