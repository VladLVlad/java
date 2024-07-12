package lesson17.practice.practice8;

public class MinMaxDemo {
    public static void main(String[] args) {
        MinMax<Integer> minMax1 = new MinMax<>(new Integer[]{2, 5, 11, 0, 32, 1});
        MinMax<Byte> minMax2 = new MinMax<>(new Byte[]{2, 5, 11, 0, 32, 1});
        MinMax<Double> minMax3 = new MinMax<>(new Double[]{5.3, 2.1, 0.9,0.8, 1.0, 4.2});
        minMax1.findMinMax();
        minMax2.findMinMax();
        minMax3.findMinMax();
    }

}
