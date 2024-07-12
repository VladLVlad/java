package lesson17.examples.example2;

public class ThreeGen<T extends String, V extends Cat, K extends Number> {

    public static void main(String[] args) {
        ThreeGen<String, Cat, Double> threeGen = new ThreeGen<>("str",new Cat("Barsik"),2.2);
        threeGen.showClasses();
    }

    private T t;
    private V v;
    private K k;

    public ThreeGen(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }


    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public void showClasses() {
        System.out.println("T: " + getT() + " " + t.getClass().getName());
        System.out.println("V: " + getV() + " " + v.getClass().getName());
        System.out.println("K: " + getK() + " " + k.getClass().getName());
    }

}
