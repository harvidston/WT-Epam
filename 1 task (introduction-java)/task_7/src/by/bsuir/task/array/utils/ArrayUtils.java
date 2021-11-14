package by.bsuir.task.array.utils;

public class ArrayUtils {
    public static void shellSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if (i != 0) i -= 2;
            }
        }
    }
}
