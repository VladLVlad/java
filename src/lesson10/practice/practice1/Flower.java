package lesson10.practice.practice1;

public class Flower {

    public static int count = 0;
    private String country;
    private int shelfLife;
    private double cost;

    public Flower(String country, int shelfLife, double cost) {
        this.country = country;
        this.shelfLife = shelfLife;
        this.cost = cost;
        count++;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
