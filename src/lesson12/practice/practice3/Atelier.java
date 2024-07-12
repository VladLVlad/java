package lesson12.practice.practice3;

public class Atelier {

    public static void dressMan(Clothes[] clothes){
        System.out.println("Man clothes:");
        for (Clothes c:
             clothes) {
            if(c instanceof ManClothes ){
                System.out.println(c.getClass().getName() + " " + c.getSizeClothes() + "(" + c.getSizeClothes().getEuroSize() + ")" + c.getColor() + " " + c.getCost());
            }
        }
    }

    public static void dressWoman(Clothes[] clothes){
        System.out.println("Woman clothes:");
        for (Clothes c:
                clothes) {
            if(c instanceof WomanClothes ){
                System.out.println(c.getClass().getName() + " " + c.getSizeClothes() + "(" + c.getSizeClothes().getEuroSize() + ")" + c.getColor() + " " + c.getCost());
            }
        }
    }

}
