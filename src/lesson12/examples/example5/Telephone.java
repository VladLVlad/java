package lesson12.examples.example5;

public class Telephone {
    private String company;
    private String model;
    private double weight;

    public Telephone() {
    }

    public Telephone(String company, String model, double weight) {
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
}
