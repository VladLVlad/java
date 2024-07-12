package lesson17.practice.practice5;

public class Food {

    public static void main(String[] args) {
        Food fish = new Food();
        fish.prepare(str -> System.out.println("Cooking " + str), "fish");
    }

    public void prepare(Cookable c, String str){
        c.cook(str);
    }
}
