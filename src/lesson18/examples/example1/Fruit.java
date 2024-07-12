package lesson18.examples.example1;

public enum Fruit {
    ORANGE(5), BANANA(7), APPLE(3);

    private int cost;

    Fruit(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
