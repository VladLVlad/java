package lesson10.practice.practice2;

public abstract class Fruit {

    public static double totalCost;

    private double weight;


    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public final void printManufacturerInfo(){
        System.out.println("Made in Belarus");
    }

    public abstract void calculateCostFruit(double cost);
}
