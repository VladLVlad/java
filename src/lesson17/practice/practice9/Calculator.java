package lesson17.practice.practice9;

public class Calculator {

    public static void main(String[] args) {
        double a = sum((short) 2, 2.5f);
        double b = divide((short) 2, 2.5f);
        double c = multiply((short) 2, 2.5f);
        double d = subtraction((short) 2, 2.5f);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public static <T extends Number, U extends Number> double sum(T a, U b){
        return a.doubleValue() + b.doubleValue();
    }
    public static <T extends Number, U extends Number> double divide(T a, U b){
        return a.doubleValue() - b.doubleValue();
    }
    public static <T extends Number, U extends Number> double multiply(T a, U b){
        return a.doubleValue() * b.doubleValue();
    }
    public static <T extends Number, U extends Number> double subtraction(T a, U b){
        return a.doubleValue() / b.doubleValue();
    }
}
