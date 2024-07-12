package lesson7.examples;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 7, 8, 9, 10, 11,12,13,14,15,55};
        System.out.println(doBinarySearch(array, 55));

    }

    public static int doBinarySearch(int[] array, int element) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (array[middleIndex] == element) {
                return middleIndex;
            }
            if (array[middleIndex] < element) {
                firstIndex = middleIndex + 1;
            }
            if (array[middleIndex] > element) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }



}
