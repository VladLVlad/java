package lesson7.examples;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] array = new int[]{15, 2, 67, 1, 0, 21, 98, 54};
        int[][] array2 = new int[][]{
                {1,4,2},
                {0,1,4,0, 22,11},
                {55,12,66,13, 0, 111},
        };
        for (int[] a:
             array2) {
            doBubbleSort(a);
            System.out.println();
        }
        doBubbleSort(array);
    }
    public static void doBubbleSort(int [] array){
        for (int i = 0; i < array.length - 1; i++){
            for (int j = array.length - 1; j > i; j--){
                if(array[j] < array[j-1]){
                    int tmp;
                    tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        for (int a:
             array) {
            System.out.print(a + " ");
        }
    }
}
