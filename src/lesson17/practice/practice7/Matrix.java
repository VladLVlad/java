package lesson17.practice.practice7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Matrix<T extends Number> {

    public static void main(String[] args) {
        Matrix<Double> matrix = new Matrix<>();
        Double[][] m1 = matrix.sumMatrix(new Double[][]{
                {1.1, 2.2},
                {1.2, 2.3}
        }, new Double[][]{
                {1.2, 2.6},
                {1.7, 2.1}
        }, Double.class);
        System.out.println(Arrays.deepToString(m1));
    }

    public T[][] sumMatrix(T[][] firstMatrix, T[][] secondMatrix, Class<T> clazz) {

        if (firstMatrix.length != secondMatrix.length || firstMatrix[0].length != secondMatrix[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }
        @SuppressWarnings("unchecked")
        T[][] newMatrix = (T[][]) Array.newInstance(clazz, firstMatrix.length, firstMatrix[0].length);
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                newMatrix[i][j] = sum(firstMatrix[i][j], secondMatrix[i][j]);
            }
        }
        return newMatrix;
    }

    private T sum(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(a.floatValue() + b.floatValue());
        } else if (a instanceof Long) {
            return (T) Long.valueOf(a.longValue() + b.longValue());
        } else if (a instanceof Short) {
            return (T) Short.valueOf((short) (a.shortValue() + b.shortValue()));
        } else if (a instanceof Byte) {
            return (T) Byte.valueOf((byte) (a.byteValue() + b.byteValue()));
        } else {
            throw new UnsupportedOperationException("Type " + a.getClass() + " is not supported");
        }
    }

}

