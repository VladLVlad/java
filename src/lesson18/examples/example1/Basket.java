package lesson18.examples.example1;

import static lesson18.examples.example1.Fruit.*;

public class Basket {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[]{
                BANANA, APPLE, ORANGE, BANANA, APPLE, APPLE, BANANA
        };

        printCount(fruits, fruit -> fruit.getCost() > 4);
        printCount(fruits, fruit -> fruit.getCost() > 3 && fruit.getCost() < 7);
    }

    public static void printCount(Fruit[] fruits, Corresponding corresponding){
        int count = 0;
        for (Fruit f:fruits){
            if(corresponding.checkCompliance(f)){
                count++;
            }
        }
        System.out.println(count);
    }
}
