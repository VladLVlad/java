package lesson12.examples.example2;

public class BDemo {
    public static void main(String[] args) {
        A.InterfaceA a = new B();

        if (a.isNotNegative(15)) {
            System.out.println("Positive");
        }
    }
}
