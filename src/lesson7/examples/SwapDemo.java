package lesson7.examples;

public class SwapDemo {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int c = 3, d = 4;
        swap(a, b);
        swap4(c, d);

    }

    public static void swap(int a, int b) {
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println(a + " " + b);
    }

    public static void swap4(int a, int b) {
        a += b;
        b = a - b;
        a -= b;
        System.out.println(a + " " + b);

    }


}
