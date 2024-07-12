package lesson20.examples.example2;

public class Square {
    private int a;
    private static int count = 0;

    public Square(int a) throws NegativeSide{
        if(a <= 0) throw new NegativeSide(a);
        this.a = a;
        count++;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static int getCount() {
        return count;
    }

    public int getP(){
        return a*4;
    }

    public int getS(){
        return a*a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }
}
