package lesson5.examples;

public class Example4 {
    public static void main(String[] args) {
        int x = 20;
        while (x > 0){
            if (x == 13){
                System.out.println("Break");
                break;
            }
            System.out.println(x--);
        }
    }
}
