package lesson12.test;

public class Example1 {
    public static void main(String[] args) {
        int[] someNumbers = new int[5];
        if (someNumbers instanceof Object) {
            System.out.println("Instance of an Object");
        } else {
            System.out.println("Not instance of an Object");
        }
    }
}
