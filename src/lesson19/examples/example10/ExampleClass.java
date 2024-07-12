package lesson19.examples.example10;

public class ExampleClass implements Example2{

    @Override
    public void showMessage2() {
        System.out.println("2");
    }

    @Override
    public void showMessage() {

        System.out.println("1");
    }
}
