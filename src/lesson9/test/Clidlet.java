package lesson9.test;

class Clidder {
    void flipper() {
        System.out.println("Clidder");
    }
}

public class Clidlet extends Clidder {
    @Override
    public final void flipper() {
        System.out.println("Clidlet");
    }

    public static void main(String[] args) {
        new Clidlet().flipper();
    }
}
