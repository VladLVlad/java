package lesson14.test;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str);
        String [] strings = new String[5];
        System.out.println(Arrays.toString(strings));
        StringBuilder [] stringBuilders = {new StringBuilder(" "), new StringBuilder()};
        System.out.println(stringBuilders.length);

        String a = "132";
        a = a.replace("1", "2");
        System.out.println(a);

        StringBuilder sb = new StringBuilder("I Java!");

        sb.insert(2, "like ");
        System.out.println(sb);
    }
}
