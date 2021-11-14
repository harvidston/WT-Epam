package by.bsuir.task.sequence.utils;

public class SequenceUtils {
    private static int smallestBiggerIndex(int[] array, int right, int key) {
        int left = -1;
        while (right - left > 1) {
            int m = left + (right - left) / 2;

            if (array[m] >= key) {
                right = m;
            } else {
                left = m;
            }
        }

        return right;
    }

    public static int lisLength(int[] array) {
        int[] subsequenceTails = new int[array.length];
        subsequenceTails[0] = array[0];
        int len = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < subsequenceTails[0]) {
                subsequenceTails[0] = array[i];
            } else if (array[i] > subsequenceTails[len - 1]) {
                subsequenceTails[len++] = array[i];
            } else {
                subsequenceTails[smallestBiggerIndex(subsequenceTails, len - 1, array[i])] = array[i];
            }
        }

        return len;
    }

    public static int amountToLis(int[] array) {
        return array.length - lisLength(array);
    }
}
