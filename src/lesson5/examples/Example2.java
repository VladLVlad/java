package lesson5.examples;

public class Example2 {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0){
            System.out.println(i--);
        }
        do {
            System.out.println(i--);
        }
        while (i>0);
    }
}
