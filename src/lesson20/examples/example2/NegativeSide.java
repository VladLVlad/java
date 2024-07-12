package lesson20.examples.example2;

public class NegativeSide extends Exception{

    private int a;

    public NegativeSide() {
    }

    public NegativeSide(int a){
        this.a = a;
    }

    public int getA() {
        return a;
    }

}
