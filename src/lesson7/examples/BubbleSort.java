package lesson7.examples;

public class BubbleSort {
    public static void main(String[] args) {
        doBubbleSort(new int[]{2, 4, 1, 6, 0});
    }

    public static void doBubbleSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if(array[j] < array[j-1]){
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }
            }

        }
        for (int a:
             array) {
            System.out.println(a + " ");
        }
    }
}
