package lesson17.examples.example4;

public class GenConstructor {

    public static void main(String[] args) {
        GenConstructor g1 = new GenConstructor(2.4);
        GenConstructor g2 = new GenConstructor( 2.2);
        GenConstructor g3 = new GenConstructor(5);
        GenConstructor[] genConstructors = {g1, g2, g3};
        for (GenConstructor g:
             genConstructors) {
            System.out.println(g.getValue());
        }

    }

    private double value;

    public <T extends Number> GenConstructor(T value) {
        this.value = value.doubleValue();
    }

    public double getValue() {
        return value;
    }

    public <T extends Number> void setValue(T value) {
        this.value = value.doubleValue();
    }

    public static void showClass(GenConstructor ob) {
        System.out.println(ob.getClass().getName());
    }
}
