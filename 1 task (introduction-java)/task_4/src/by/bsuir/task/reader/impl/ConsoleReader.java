package by.bsuir.task.reader.impl;

import by.bsuir.task.reader.interfaces.Reader;
import by.bsuir.task.writer.impl.ConsoleWriter;
import by.bsuir.task.writer.interfaces.Writer;

import java.util.Scanner;

public class ConsoleReader implements Reader {
    private final Scanner scanner;
    private final Writer writer;

    public ConsoleReader(ConsoleWriter writer) {
        scanner = new Scanner(System.in);
        this.writer = writer;
    }

    @Override
    public int readInt() {
        var valid = false;
        int result = 0;

        while (!valid) {
            try {
                result = Integer.parseInt(scanner.nextLine());
                valid = true;
            } catch (NumberFormatException ex) {
                writer.println("Invalid format. Try again.");
            }
        }

        return result;
    }
}
