package lesson12.practice.practice3;

public class Trousers extends Clothes implements ManClothes,WomanClothes{

    public Trousers(SizeClothes sizeClothes, double cost, String color) {
        super(sizeClothes, cost, color);
    }
}
