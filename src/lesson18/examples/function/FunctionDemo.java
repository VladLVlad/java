package lesson18.examples.function;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, String> function = i -> {
            if (i > 0){
                return "" + i + " is positive number";
            } else if (i < 0) {
                return "" + i + " is negative number";
            }
            return "Zero";
        };
        System.out.println(function.apply(5));
        System.out.println(function.apply(-5));
        System.out.println(function.apply(0));
    }
}
