package by.bsuir.task.sequence.utils;

public class SequenceUtils {
    public static int[] mergeNDSequencesIndexes(int[] sequence1, int[] sequence2) {
        int[] result = new int[sequence2.length];

        for (int i = 0; i < sequence2.length; i++) {
            int index = 0;
            while (index < sequence1.length && sequence1[index] < sequence2[i]) index++;
            result[i] = index - 1;
        }

        return result;
    }
}
