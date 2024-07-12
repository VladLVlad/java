package lesson19.examples.PECS;

import java.util.ArrayList;
import java.util.List;

import static lesson19.examples.PECS.Consumer.*;
import static lesson19.examples.PECS.Producer.*;

public class PECSDemo {
    public static void main(String[] args) {
        List<Phone> phoneList = new ArrayList<>(List.of(
                new Phone("Model1", 24.3),
                new Phone("Model2", 27.1)
        ));
        List<MobilePhone> mobilePhoneList = new ArrayList<>(List.of(
                new MobilePhone("Nokia", 45.3, 2),
                new MobilePhone("Samsung", 42.2, 1),
                new SmartPhone("iPhone", 3213.2, 1, "iOS")
        ));
        List<SmartPhone> smartPhoneList = new ArrayList<>(List.of(
                new SmartPhone("Xiaomi", 1190.4, 2, "Android"),
                new SmartPhone("Samsung", 1210.6, 2, "Android")
        ));
        //Producer.processUpperBounded(phoneList);
        processUpperBounded(mobilePhoneList);
        processUpperBounded(smartPhoneList);
        processLowerBounded(phoneList);

        phoneList.forEach(System.out::println);
    }
}
