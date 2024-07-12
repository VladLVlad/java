package lesson10.practice.practice2;

public class FruitDemo {
    public static void main(String[] args) {
        Fruit[] fruits = {
          new Apple(3.3),
          new Apple(2.3),
          new Banana(5.7),
          new Banana(7.7),
          new Orange(4),
          new Orange(5)
        };

        fruits[0].calculateCostFruit(2);
        fruits[1].calculateCostFruit(3);
        fruits[2].calculateCostFruit(2);
        fruits[3].calculateCostFruit(3);
        fruits[4].calculateCostFruit(2);
        fruits[5].calculateCostFruit(4);

        System.out.println("Apple: " + Apple.totalAppleCost);
        System.out.println("Banana: " + Banana.totalBananaCost);
        System.out.println("Orange: " + Orange.totalOrangeCost);
        System.out.println("Total: " + Fruit.totalCost);
    }
}
