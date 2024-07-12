package lesson4.practice;

public class AverageValue {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        System.out.println("average value is " +  ((a+b+c) / 3));
    }
}
