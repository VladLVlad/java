package lesson20.examples.example3;

public class MoreTenException extends Exception{
    private int a;

    public MoreTenException() {
    }

    public MoreTenException(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
}
