package lesson17.examples;

public class Matrix <T>{
    private T[] array;

    public Matrix(T[] array) {
        this.array = array.clone();
    }

    public static void main(String[] args) {
        Matrix<Double> matrix1 = new Matrix<>(new Double[2]);
        Matrix<Integer> matrix2 = new Matrix<>(new Integer[3]);
        Matrix<Short> matrix3 = new Matrix<>(new Short[4]);
        //Matrix<int> matrix4 = new Matrix<int>(new int[5]);

        matrix2.array[0] = 1;
        matrix2.array[1] = 2;
        matrix2.array[2] = 3;
        //matrix2.array[3] = 4;
        //matrix2.array[4] = 5;

        for (int a:
                matrix2.array) {
            System.out.print(a + " ");
        }
    }
}
