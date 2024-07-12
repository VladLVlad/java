package lesson19.examples.example10;

public class ExampleDemo {
    public static void main(String[] args) {
        ExampleInterface example1 = new ExampleClass();
        Example2 example2 = new ExampleClass();

        example1.showMessage();
        example2.showMessage();
        example2.showMessage2();
    }
}
