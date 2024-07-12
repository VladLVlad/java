package lesson12.practice.practice3;

public class ClothesDemo {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new T_Shirt(SizeClothes.L, 22.4, ""),
                new T_Shirt(SizeClothes.XS, 20.4, ""),
                new Trousers(SizeClothes.S, 15, ""),
                new Trousers(SizeClothes.M, 14, ""),
                new Tie(SizeClothes.S, 1.4, ""),
                new Tie(SizeClothes.S, 1.8, ""),
                new Skirt(SizeClothes.XXS, 14.5,""),
                new Skirt(SizeClothes.XS, 14.9,"")
        };

        Atelier.dressMan(clothes);
        Atelier.dressWoman(clothes);
    }
}
