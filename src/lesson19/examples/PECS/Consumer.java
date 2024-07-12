package lesson19.examples.PECS;

import java.util.List;

public class Consumer {
    public static void processLowerBounded(List<? super MobilePhone> phones){
        phones.add(new SmartPhone("Model", 4500, 1, "OS"));
    }
}
