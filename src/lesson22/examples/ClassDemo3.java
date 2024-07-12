package lesson22.examples;

import lesson12.examples.example6.HeavyBox;

import java.util.Arrays;

public class ClassDemo3 {
    public static void main(String[] args) {
        Class<HeavyBox> heavyBoxClass = HeavyBox.class;

        System.out.println("Declared Constructors: "
                + Arrays.toString(heavyBoxClass.getDeclaredConstructors()));
        System.out.println("Constructors: "
                + Arrays.toString(heavyBoxClass.getConstructors()));

        System.out.println("Declared Methods: "
                + Arrays.toString(heavyBoxClass.getDeclaredMethods()));
        System.out.println("Methods: "
                + Arrays.toString(heavyBoxClass.getMethods()));

        System.out.println("Declared Fields: "
                + Arrays.toString(heavyBoxClass.getDeclaredFields()));
        System.out.println("Fields: "
                + Arrays.toString(heavyBoxClass.getFields()));
    }
}
