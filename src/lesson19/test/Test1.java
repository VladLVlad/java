package lesson19.test;

public class Test1 {


}
class Potato {
    public void peel() {
        System.out.println("peeling potato");
    }
}

class Food {
    Potato p = new Potato() {
        public void fry() {
            System.out.println("frying potato anonymously ");
        }

        public void peel() {
            System.out.println("peeling potato anonymously");
        }
    };

    public void prepare() {
        p.peel();
    }
}