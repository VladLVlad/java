package lesson10.practice.practice2;

public class Apple extends Fruit{
    public static double totalAppleCost;

    public Apple(double weight) {
        super(weight);
    }

    @Override
    public void calculateCostFruit(double cost) {
        double costGoods = cost*getWeight();
        totalAppleCost += costGoods;
        totalCost += costGoods;
    }
}
