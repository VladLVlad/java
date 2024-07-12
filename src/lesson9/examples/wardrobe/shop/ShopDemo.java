package lesson9.examples.wardrobe.shop;

import lesson9.examples.wardrobe.ColorWardrobe;
import lesson9.examples.wardrobe.Wardrobe;

public class ShopDemo {
    public static void main(String[] args) {
        Shop shop = new Shop();
        ColorShop colorShop = new ColorShop();
        Shop shop2 = new ColorShop();
        Wardrobe wardrobe = shop.doWardrobe();
        ColorWardrobe colorWardrobe = colorShop.doWardrobe();
        wardrobe.setAll(11.2, 7, 3.3);
        colorWardrobe.setAll(12, 8, 4.1, "blue");

        wardrobe.getInformation();
        colorWardrobe.getInformation();



    }
}
