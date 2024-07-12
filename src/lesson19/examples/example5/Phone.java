package lesson19.examples.example5;

import java.util.Objects;

public class Phone {

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
        return Objects.equals(model, phone.model) && Objects.equals(version, phone.version) && Objects.equals(cost, phone.cost);
    }

    @Override
    public int hashCode() {
        return this.model.length() + this.version.length() + (int) this.cost/100;
    }
}
