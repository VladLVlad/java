package lesson11.examples.example1;

public class SmartphoneDemo {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("Apple", "iPhone 12", 40);
        Smartphone smartphone2 = new Smartphone("Apple", "iPhone 12", 40);
        Smartphone smartphone3 = new Smartphone("Apple", "iPhone 12", 40.5);
        Smartphone smartphone4 = new Smartphone("Xiaomi", "r25", 40);


        System.out.println(smartphone1.equals(smartphone2));
        System.out.println(smartphone1.equals(smartphone3));
        System.out.println(smartphone3.equals(smartphone4));

        System.out.println(smartphone1);

    }
}
