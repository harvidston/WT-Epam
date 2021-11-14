package by.bsuir.task;

import by.bsuir.task.prime.util.PrimeUtils;
import by.bsuir.task.reader.impl.ConsoleReader;
import by.bsuir.task.writer.impl.ConsoleWriter;
import by.bsuir.task.writer.interfaces.Writer;

public class Main {
    public static void main(String[] args) {
        var writer = new ConsoleWriter();
        var reader = new ConsoleReader(writer);

        writer.println("Input size:");
        var size = reader.readInt();

        var array = new int[size];
        for (int i = 0; i < array.length; i++) {
            writer.println("Input element " + (i + 1) + ":");
            array[i] = reader.readInt();
        }

        outputPrimeIndexes(writer, array);
    }

    private static void outputPrimeIndexes(Writer writer, int[] array) {
        writer.print("Indexes of prime numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (PrimeUtils.isPrime(array[i])) {
                writer.print(i + " ");
            }
        }
    }
}
