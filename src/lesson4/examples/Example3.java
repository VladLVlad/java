package lesson4.examples;

import java.util.Objects;

public class Example3 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "Hello";
        System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1,s2));
    }
}
