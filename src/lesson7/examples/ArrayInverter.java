package lesson7.examples;

public class ArrayInverter {

    public static void showInverter(int [] array){
        for (int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array [i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        for (int a:
                array ) {
            System.out.print(a + " ");
        }
    }
}
