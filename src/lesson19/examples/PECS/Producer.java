package lesson19.examples.PECS;

import java.util.List;

public class Producer {
    public static void processUpperBounded(List<? extends MobilePhone> phones){
        phones.forEach(System.out::println);
        double sum = 0.0;
        for (MobilePhone p:
             phones) {
            sum += p.getCost();
        }
        System.out.println("average cost: "+ (sum / phones.size()));
    }
}
