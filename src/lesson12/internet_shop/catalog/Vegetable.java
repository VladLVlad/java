package lesson12.internet_shop.catalog;

public class Vegetable extends Category{

    public Vegetable(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return null;
    }

    public enum VegetableKinds{
        CUCUMBER(1.3), POTATO(0.9), TOMATO(4.5);

        private double cost;

        VegetableKinds(double cost) {
            this.cost = cost;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }
    }
}
