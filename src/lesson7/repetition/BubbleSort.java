package lesson7.repetition;

public class BubbleSort {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{5, 10, 1, 32, 12, 0};
        Double[] array2 = new Double[]{2.2, 11.2, 0.95, 13.0, 0.92, 3.0 };
        doBubbleSort(array);
        doBubbleSort2(array);
        doBubbleSort(array2);
        doBubbleSort2(array2);
    }

    public static <T extends Number> void doBubbleSort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) { // int i = array.length - 1; i > 0; i--
             boolean tf = false;
            for (int j = array.length - 1; j > i; j--) { // int j = 0; j < i; j++
                if (array[j - 1].doubleValue() > array[j].doubleValue()) {
                    T tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                    tf = true;
                }

            }
            if (!tf){
                break;
            }

        }
        for (T a :
                array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
    public static <T extends Number> void doBubbleSort2(T[] array) {
        for (int i = 0; i < array.length - 1; i++){
            boolean tf = false;
            for (int j = 0; j < array.length - 1 - i; j++){
                if(array[i].doubleValue() < array[j+1].doubleValue()){
                    T tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    tf = true;
                }
            }
            if (!tf){
                break;
            }
        }
        for (T a :
                array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}

