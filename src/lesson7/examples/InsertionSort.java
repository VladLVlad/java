package lesson7.examples;

public class InsertionSort {
    public static void main(String[] args) {

        insertionSort(new int[]{1,5,2,9,1});
    }
    public static void insertionSort(int[] array){
        for (int i= 1; i < array.length; i++){
            int element = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > element ){
                array[j+1] = array[j];
                j--;
            }
            array[j +1 ] = element;
        }
        for (int a:
             array) {
            System.out.print(a + " ");
        }
    }
}
