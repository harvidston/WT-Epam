package by.bsuir.task;

import by.bsuir.task.calculator.impl.TaskCalculator;
import by.bsuir.task.reader.impl.ConsoleReader;
import by.bsuir.task.writer.impl.ConsoleWriter;

public class Main {
    public static void main(String[] args) {
        var writer = new ConsoleWriter();
        var reader = new ConsoleReader(writer);
        var calculator = new TaskCalculator();

        writer.println("Input x:");
        var x = reader.readDouble();

        writer.println("Input y:");
        var y = reader.readDouble();

        writer.println("Result = " + calculator.calculate(x, y));
    }
}
