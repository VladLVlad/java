package lesson9.practice.practice3;

public class MatrixDemo {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3,3);
        Matrix matrix2 = new Matrix(3,3);

        System.out.println(matrix.showMatrix());

        System.out.println(matrix2.showMatrix());

        matrix.sumMatrix(matrix2.getMatrix());
        matrix2.multiplyNumber(3);
        matrix.multiplyMatrices(matrix2.getMatrix());

        System.out.println(matrix.showMatrix());

    }
}
