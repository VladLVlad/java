package lesson12.examples.example7;

public class ClothesDemo {
    public static void main(String[] args) {
        Clothes clothes = new Clothes("jeans", SizeClothes.valueOf("XXL"));
        System.out.println(clothes);

        switch (clothes.getSizeClothes()) {
            case XS -> System.out.println("Take XS");
            case S -> System.out.println("Take S");
            case M -> System.out.println("Take M");
            case L -> System.out.println("Take L");
            case XL -> System.out.println("Take XL");

            default -> System.out.println("Don't take!");
        }



        SizeClothes[] sizeClothes = SizeClothes.values();
        for (SizeClothes s:
             sizeClothes) {
            System.out.println(s + " " + s.ordinal() + " " + s.getSize() + " " + s.showSize());
        }
    }
}
