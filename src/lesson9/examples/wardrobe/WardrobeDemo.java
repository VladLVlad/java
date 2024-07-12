package lesson9.examples.wardrobe;

public class WardrobeDemo {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe(5.1, 3.5,2.1);
        ColorWardrobe colorWardrobe = new ColorWardrobe(6, 4, 1.9, "green");
        CostColorWardrobe costColorWardrobe = new CostColorWardrobe(5, 4,3,"red", 11);
        HeavyWardrobe heavyWardrobe = new HeavyWardrobe(4, 2.5, 1.3, 12);
        wardrobe.getInformation();
        colorWardrobe.getInformation();
        costColorWardrobe.getInformation();
        heavyWardrobe.getInformation();
    }
}
