package lesson19.practice.practice7;

public class Toy {
    private double cost;
    private double weight;

    public Toy(double cost, double weight) {
        this.cost = cost;
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "cost=" + cost +
                ", weight=" + weight +
                '}';
    }
}
