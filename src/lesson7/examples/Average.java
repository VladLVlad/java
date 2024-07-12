package lesson7.examples;

public class Average {
    public static void main(String[] args) {
        double [] array = new double[]{15.5, 15, 16, 31, 0, 17, 14};
        double sum = 0;
        double average;
        for (double a:
             array) {
            sum += a;
        }
        average = sum / array.length;
        System.out.println(average);
    }
}
