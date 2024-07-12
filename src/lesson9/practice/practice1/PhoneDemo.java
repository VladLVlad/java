package lesson9.practice.practice1;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone iPhone = new Phone("+375 (29) 789-45-61", "iPhone 15", 40.5);
        Phone Samsung = new Phone("+375 (33) 333-42-71", "Samsung s23", 43.3);
        Phone Xiaomi = new Phone("+375 (29) 459-11-68", "Xiaomi redmi note 13", 41.6);


        Phone[] phones = new Phone[]{iPhone, Samsung, Xiaomi};
        String [] names = {"Petya", "Stepan", "Slava"};
        String [] numbers = {"+375 (29) 459-11-77", "+375 (29) 459-11-88", "+375 (29) 459-11-22"};
        int i = 0;

        for (Phone p:
             phones) {
            System.out.println(p.getNumber()+ " " + p.getModel() + " " + p.getWeight());
            p.receiveCall(names[i]);
            p.receiveCall(names[i], numbers[i]);
            i++;
        }

        iPhone.sendMessage("+375 (29) 459-11-77", "+375 (29) 459-11-88", "+375 (29) 459-11-22");
    }
}
