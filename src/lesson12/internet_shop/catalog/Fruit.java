package lesson12.internet_shop.catalog;

public class Fruit extends Category {

    public Fruit(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "Description fruits";
    }


    public enum FruitKinds {
        BANANA(20.3), APPLE(17.4), ORANGE(4.5);

        private double cost;

        FruitKinds(double cost) {
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
