package lesson12.internet_shop.catalog;

public class Meat extends Category{
    public Meat(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "Meat description";
    }

    public enum MeatKinds{

        SAUSAGE(11.3), CHICKEN(30.5), PORK(40);

        private double cost;

        MeatKinds(double cost) {
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
