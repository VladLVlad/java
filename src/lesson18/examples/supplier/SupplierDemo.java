package lesson18.examples.supplier;

import lesson12.examples.example6.HeavyBox;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        HeavyBox heavyBox = new HeavyBox(4.3,2.3,1.4,2.7);
        Supplier<Integer> supplier = () -> (int) (Math.random() * 11);
        Supplier<Double> supplier2 = heavyBox::getWeight;
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
}
