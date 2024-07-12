package lesson10.practice.practice1;

import static lesson10.practice.practice1.Flower.count;

public class FlowerDemo {
    public static void main(String[] args) {
        Flower[] flowers = {
                new Chamomile("Russia", 12, 1.1),
                new Chamomile("Russia", 12, 1.1),
                new Rose("Belarus", 10, 5.5),
                new Rose("Belarus", 10, 5.5),
                new Tulip("Poland", 11, 3.5),
                new Tulip("Poland", 11, 3.5)
        };

        double totalPrice = 0;
        for (Flower flower:
             flowers) {
            totalPrice += flower.getCost();
        }
        System.out.println("Total price is " + totalPrice + "; quantity: " + count);
    }
}
