package lesson11.examples.example1;

import java.util.Objects;

public class Smartphone {
    private String company;
    private String model;
    private double weight;

    public Smartphone(String company, String model, double weight) {
        this.company = company;
        this.model = model;
        this.weight = weight;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return Objects.equals(company, that.company) && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, model, weight);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
