package lesson17.examples.example3;

public class Average<T extends Number> {

    public static void main(String[] args) {
        Average<Double> doubleAverage = new Average<>(new Double[]{10.2, 1.9, 0.9});
        Average<Integer> integerAverage = new Average<>(new Integer[]{10, 2, 1});
        System.out.println(doubleAverage.getAverage());
        System.out.println(integerAverage.getAverage());
        System.out.println(doubleAverage.compareAverage(integerAverage));

    }

    private T[] array;

    public Average(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public double getAverage() {
        double sum = 0;
        for (T t : array) {
            sum += t.doubleValue();
        }
        return sum / array.length;
    }

    public String compareAverage(Average<?> ob) {
        return getAverage() > ob.getAverage() ? getAverage() + " > " + ob.getAverage() :
                getAverage() < ob.getAverage() ? getAverage() + " < " + ob.getAverage() :
                        getAverage() + " = " + ob.getAverage();
    }


}
