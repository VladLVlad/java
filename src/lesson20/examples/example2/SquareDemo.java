package lesson20.examples.example2;

import static lesson20.examples.example2.Square.*;

public class SquareDemo {
    public static void main(String[] args) {
        try {
            Square s = new Square(2);
            System.out.println("P: " + s.getP() + ", S: " + s.getS());
            Square s2 = new Square(3);
            System.out.println("P: " + s2.getP() + ", S: " + s2.getS());
            Square s3 = new Square(-2);
            System.out.println("P: " + s3.getP() + ", S: " + s3.getS());
            Square s4 = new Square(1);
            System.out.println("P: " + s4.getP() + ", S: " + s4.getS());

        }catch (NegativeSide ex){
            System.out.println("Negative side: " + ex.getA());
        }
        System.out.println("Count: " + getCount());
    }
}
