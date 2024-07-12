package lesson17.practice.practice8;

public class MinMax <T extends Number>{
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public void findMinMax(){
        T min = array[0];
        T max = array[0];
        for (int i = 1; i < array.length; i++){
            if(array[i].doubleValue() < min.doubleValue()){
                min = array[i];
            }
            if (max.doubleValue() < array[i].doubleValue()){
                max =array[i];
            }
        }
        System.out.println("min :" + min);
        System.out.println("max :" + max);
    }
}
