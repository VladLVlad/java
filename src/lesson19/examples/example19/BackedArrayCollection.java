package lesson19.examples.example19;

import java.util.Arrays;
import java.util.List;

public class BackedArrayCollection {
    public static void main(String[] args) {

        String[] array = {"watermelon", "cherry", "melon"};
        List<String> list = Arrays.asList(array);

        System.out.println("List:" + list);
        System.out.println("Array:" + Arrays.toString(array));

        list.set(0, "apple");
        //list.add("2"); error
        array[1] = "loganberry";

        System.out.println("List:" + list);
        System.out.println("Array:" + Arrays.toString(array));
    }
}
