package lesson7.repetition;

public class SelectionSort {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        array[0] = 5;
        array[1] = 1;
        array[2] = 10;
        array[3] = 0;
        array[4] = 4;
        doSelectionSort(array);
        Double[] array2 = new Double[]{1.2, 0.56, 2.1, 1.1, 0.67, 0.94};
        doSelectionSort(array2);
    }

    public static <T extends Number> void doSelectionSort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            T min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (min.doubleValue() > array[j].doubleValue()) {
                    min = array[j];
                    index = j;
                }
            }
            if (index != i) {
                array[index] = array[i];
                array[i] = min;
            }
        }

        for (T a :
                array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
