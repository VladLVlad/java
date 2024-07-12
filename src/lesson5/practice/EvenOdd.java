package lesson5.practice;

public class EvenOdd {
    public static void main(String[] args) {


        for (String arg : args) {
            if (Integer.parseInt(arg) % 2 != 0) {
                System.out.println(arg);
            }
        }
    }
}
