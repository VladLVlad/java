package lesson12.internet_shop.catalog;

import java.util.Scanner;

import static lesson12.internet_shop.basket.Basket.*;
import static lesson12.internet_shop.catalog.Fruit.FruitKinds;
import static lesson12.internet_shop.catalog.Meat.MeatKinds;
import static lesson12.internet_shop.catalog.Vegetable.VegetableKinds;

public abstract class Category {

    private static Scanner scanner = new Scanner(System.in);
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getDescription();

    public static void showCategory() {
        System.out.println("""
                Choose category:\s
                1. Fruits\s
                2. Meat\s
                3. Vegetables\s
                4. Show Basket\s
                """);
        String line = scanner.nextLine();
        switch (line) {
            case "1" -> {
                int i = 1;
                for (FruitKinds f :
                        FruitKinds.values()) {
                    System.out.println(i++ + ". " + f + " " + f.getCost());

                }
                System.out.println(i + ". Back");
                System.out.println("Add product");
                addFruit();
            }
            case "2" -> {
                int i = 1;
                for (MeatKinds m :
                        MeatKinds.values()) {
                    System.out.println(i++ + ". " + m + " " + m.getCost());

                }
                System.out.println(i + ". Back");
                System.out.println("Add product");
                addMeat();
            }
            case "3" -> {
                int i = 1;
                for (VegetableKinds v:
                     VegetableKinds.values()) {
                    System.out.println(i++ + ". " + v + " " + v.getCost());
                }
                System.out.println(i + ". Back");
                System.out.println("Add product");
                addVegetable();
            }
            case "4" -> {
                showBasket();
            }
            default -> {
                System.out.println("Enter from 1 to 4");
                showCategory();
            }
        }

    }
}
