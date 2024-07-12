package lesson12.practice.practice3;

public abstract class Clothes {
    private SizeClothes sizeClothes;
    private double cost;
    private String color;

    public Clothes(SizeClothes sizeClothes, double cost, String color) {
        this.sizeClothes = sizeClothes;
        this.cost = cost;
        this.color = color;
    }

    public SizeClothes getSizeClothes() {
        return sizeClothes;
    }

    public void setSizeClothes(SizeClothes sizeClothes) {
        this.sizeClothes = sizeClothes;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
