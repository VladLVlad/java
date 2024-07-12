package lesson17.examples.example7;

public class Calculator <T extends Number, U extends Number>{
    private T t;
    private U u;

    public Calculator(T t, U u) {
        this.t = t;
        this.u = u;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }

    public void calculate(){
        class Difference{
            public void calculateDifference(){
                System.out.println("Difference :" + (t.doubleValue() - u.doubleValue()));
            }
        }
        Difference difference = new Difference();
        difference.calculateDifference();
        System.out.println("Sum :" + (t.doubleValue() + u.doubleValue()));
    }



}
