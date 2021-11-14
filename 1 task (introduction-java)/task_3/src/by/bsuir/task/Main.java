package by.bsuir.task;

import by.bsuir.task.calculator.impl.TaskCalculator;
import by.bsuir.task.range.Range;
import by.bsuir.task.reader.impl.ConsoleReader;
import by.bsuir.task.writer.impl.ConsoleWriter;
import by.bsuir.task.writer.interfaces.Writer;

public class Main {
    public static void main(String[] args) {
        var writer = new ConsoleWriter();
        var reader = new ConsoleReader(writer);

        writer.println("Input a:");
        var a = reader.readDouble();

        writer.println("Input b:");
        var b = reader.readDouble();

        writer.println("Input h:");
        var h = reader.readDouble();

        outputFunctionTable(writer, a, b, h);
    }

    private static void outputFunctionTable(Writer writer, double a, double b, double h) {
        var range = new Range(a, b, h);
        var calculator = new TaskCalculator();
        for (var number: range) {
            writer.println(number + " | " + calculator.calculate(number));
        }
    }
}
