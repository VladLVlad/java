package lesson20.examples.example6;

public class ExceptionInConstructorTest {
    public static void main(String[] args) {
        ConstructorException p = null;
        try {
            p = new ConstructorException(0);
        } catch (ArithmeticException e) {
            System.out.println("!!");
        }
        System.out.println(p.getI());
    }
}
