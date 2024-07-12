package lesson9.practice.practice1;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.println("Call " + name);
    }

    public void receiveCall(String name, String number){
        System.out.println("Call " + name + " from number " + number);
    }

    public void sendMessage(String ... numbers){
        for (String n:
             numbers) {
            System.out.println("send 'Hello' to " + n);
        }

    }
}
