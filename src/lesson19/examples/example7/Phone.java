package lesson19.examples.example7;

import java.util.Objects;

public class Phone implements Comparable<Phone> {

    private String model;
    private String version;
    private double cost;

    public Phone(String model, String version, double cost) {
        this.model = model;
        this.version = version;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", version='" + version + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Double.compare(phone.cost, cost) == 0 && Objects.equals(model, phone.model) && Objects.equals(version, phone.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, version, cost);
    }

    @Override
    public int compareTo(Phone o) {
        return Double.compare(this.cost, o.getCost());
    }
}

