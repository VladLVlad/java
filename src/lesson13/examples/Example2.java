package lesson13.examples;

public class Example2 {
    public static void main(String[] args) {
        Integer i = 200;
        Integer i2 = i;
        System.out.println((i.equals(i2)) + " " + i + " " + i2);

        i2++;

        System.out.println((i.equals(i2)) + " " + i + " " + i2);
    }
}
