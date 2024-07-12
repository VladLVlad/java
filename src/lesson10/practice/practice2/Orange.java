package lesson10.practice.practice2;

public class Orange extends Fruit{

    public static double totalOrangeCost;

    public Orange(double weight) {
        super(weight);
    }

    @Override
    public void calculateCostFruit(double cost) {
        double costGoods = cost*getWeight();
        totalOrangeCost += costGoods;
        totalCost += costGoods;
    }
}
