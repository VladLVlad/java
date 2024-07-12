package lesson9.examples.wardrobe.shop;

import lesson9.examples.wardrobe.ColorWardrobe;
import lesson9.examples.wardrobe.Wardrobe;

public class ColorShop extends Shop{
    @Override
    public ColorWardrobe doWardrobe() {
        return new ColorWardrobe();
    }

    public static void go() {
        System.out.println("go ColorShop");
    }


}
