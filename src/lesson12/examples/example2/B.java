package lesson12.examples.example2;

public class B implements A.InterfaceA{
    @Override
    public boolean isNotNegative(int x) {
        return x >= 0;
    }
}
