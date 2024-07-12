package lesson10.practice.practice2;

public class Banana extends Fruit{
    public static double totalBananaCost;

    public Banana(double weight) {
        super(weight);
    }

    @Override
    public void calculateCostFruit(double cost) {
        double costGoods = cost*getWeight();
        totalBananaCost += costGoods;
        totalCost += costGoods;
    }
}
