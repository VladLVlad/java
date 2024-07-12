package lesson12.practice.practice3;

public class T_Shirt extends Clothes implements ManClothes,WomanClothes{

    public T_Shirt(SizeClothes sizeClothes, double cost, String color) {
        super(sizeClothes, cost, color);
    }
}
