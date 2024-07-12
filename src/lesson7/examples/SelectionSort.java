package lesson7.examples;

public class SelectionSort {
    public static void main(String[] args) {
        doSelectionSort(new int[]{2, 4, 1, 6, 0});
        int[][] array2 = new int[][]{
                {1,4,2},
                {0,1,4,0, 22,11},
                {55,12,66,13, 0, 111},
                {99, 98, 97, 96, 95, 94, 93, 92, 91, 1, 0 },
        };
        for (int[] a:
                array2) {
            doSelectionSort(a);
            System.out.println();
        }
    }

    public static void doSelectionSort(int[] array) {
        for (int i = 0; i < array.length-1; i++){
            int min = array[i], index = i;
            for (int j = i + 1; j < array.length; j++){
                if(array[j] < min){
                    min = array[j];
                    index = j;
                }
            }
            array[index] = array[i];
            array[i] = min;
        }
        for (int a:
             array) {
            System.out.print(a + " ");
        }
    }
}
