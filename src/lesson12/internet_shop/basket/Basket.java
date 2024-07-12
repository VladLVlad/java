package lesson12.internet_shop.basket;

import java.util.Scanner;

import static lesson12.internet_shop.catalog.Category.showCategory;
import static lesson12.internet_shop.catalog.Fruit.FruitKinds;
import static lesson12.internet_shop.catalog.Fruit.FruitKinds.*;
import static lesson12.internet_shop.catalog.Meat.MeatKinds;
import static lesson12.internet_shop.catalog.Meat.MeatKinds.*;
import static lesson12.internet_shop.catalog.Vegetable.VegetableKinds;
import static lesson12.internet_shop.catalog.Vegetable.VegetableKinds.*;

public class Basket {
    private static Scanner scanner = new Scanner(System.in);

    private static FruitKinds[] fruitKinds = {};
    private static MeatKinds[] meatKinds = {};
    private static VegetableKinds[] vegetableKinds = {};

    public static void addFruit() {
        String number = scanner.nextLine();
        switch (number) {
            case "1" -> {
                fruitKinds = createNewFruitBasket(fruitKinds, BANANA);
                System.out.println(BANANA + " add");
                addFruit();
            }
            case "2" -> {
                fruitKinds = createNewFruitBasket(fruitKinds, APPLE);
                System.out.println(APPLE + " add");
                addFruit();
            }
            case "3" -> {
                fruitKinds = createNewFruitBasket(fruitKinds, ORANGE);
                System.out.println(ORANGE + " add");
                addFruit();
            }
            case "4" -> {
                showCategory();
            }
            default -> {
                System.out.println("Enter from 1 to 4");
                addFruit();
            }
        }
    }

    public static void addMeat() {
        String number = scanner.nextLine();
        switch (number){
            case "1" -> {
                meatKinds = createNewMeatBasket(meatKinds, SAUSAGE);
                System.out.println(SAUSAGE + " add");
                addMeat();
            }
            case "2" -> {
                meatKinds = createNewMeatBasket(meatKinds, CHICKEN);
                System.out.println(CHICKEN + " add");
                addMeat();
            }
            case "3" -> {
                meatKinds = createNewMeatBasket(meatKinds, PORK);
                System.out.println(PORK + " add");
                addMeat();
            }
            case "4" -> {
                showCategory();
            }
            default -> {
                System.out.println("Enter from 1 to 4");
                addMeat();
            }
        }
    }

    public static void addVegetable() {
        String number = scanner.nextLine();
        switch (number){
            case "1" -> {
                vegetableKinds = createNewVegetableBasket(vegetableKinds, CUCUMBER);
                System.out.println(CUCUMBER + " add");
                addVegetable();
            }
            case "2" -> {
                vegetableKinds = createNewVegetableBasket(vegetableKinds, POTATO);
                System.out.println(POTATO + " add");
                addVegetable();
            }
            case "3" -> {
                vegetableKinds = createNewVegetableBasket(vegetableKinds, TOMATO);
                System.out.println(TOMATO + " add");
                addVegetable();
            }
            case "4" -> {
                showCategory();
            }
            default -> {
                System.out.println("Enter from 1 to 4");
                addVegetable();
            }
        }

    }

    public static FruitKinds[] createNewFruitBasket(FruitKinds[] fruitKinds, FruitKinds fruitKind) {
        FruitKinds[] newFruitKinds = new FruitKinds[fruitKinds.length + 1];
        System.arraycopy(fruitKinds, 0, newFruitKinds, 0, fruitKinds.length);
        newFruitKinds[newFruitKinds.length - 1] = fruitKind;
        return newFruitKinds;
    }

    public static MeatKinds[] createNewMeatBasket(MeatKinds[] meatKinds, MeatKinds meatKind) {
        MeatKinds[] newMeatKinds = new MeatKinds[meatKinds.length + 1];
        System.arraycopy(meatKinds, 0, newMeatKinds,0,meatKinds.length);
        newMeatKinds[newMeatKinds.length -1] = meatKind;
        return newMeatKinds;
    }

    public static VegetableKinds[] createNewVegetableBasket(VegetableKinds[] vegetableKinds, VegetableKinds vegetableKind){
        VegetableKinds[] newVegetableKinds = new VegetableKinds[vegetableKinds.length +1];
        System.arraycopy(vegetableKinds, 0,newVegetableKinds,0,vegetableKinds.length);
        newVegetableKinds[newVegetableKinds.length-1] = vegetableKind;
        return newVegetableKinds;
    }

    public static void showBasket() {
        System.out.println("Fruits:");
        for (FruitKinds f :
                fruitKinds) {
            System.out.println(f);
        }
        System.out.println("Meat:");
        for (MeatKinds m :
                meatKinds){
            System.out.println(m);
        }
        System.out.println("Vegetables");
        for (VegetableKinds v:
             vegetableKinds) {
            System.out.println(v);
        }
    }

}
