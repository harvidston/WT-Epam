package by.bsuir.task;

import by.bsuir.task.reader.impl.ConsoleReader;
import by.bsuir.task.reader.interfaces.Reader;
import by.bsuir.task.sequence.utils.SequenceUtils;
import by.bsuir.task.writer.impl.ConsoleWriter;
import by.bsuir.task.writer.interfaces.Writer;

public class Main {
    public static void main(String[] args) {
        var writer = new ConsoleWriter();
        var reader = new ConsoleReader(writer);

        writer.println("Input size of sequence 1:");
        int[] seq1 = inputArray(writer, reader);

        writer.println("Input size of sequence 2:");
        int[] seq2 = inputArray(writer, reader);

        int[] indexes = SequenceUtils.mergeNDSequencesIndexes(seq1, seq2);
        outputArray(writer, indexes);
    }

    private static int[] inputArray(Writer writer, Reader reader) {
        var size = reader.readInt();

        var array = new int[size];
        for (int i = 0; i < array.length; i++) {
            writer.println("Input element " + (i + 1) + ":");
            array[i] = reader.readInt();
        }

        return array;
    }

    private static void outputArray(Writer writer, int[] array) {
        for (int number : array) {
            writer.print(number + " ");
        }
    }
}
