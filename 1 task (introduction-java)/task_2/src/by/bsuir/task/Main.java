package by.bsuir.task;

import by.bsuir.task.area.impl.FreeArea;
import by.bsuir.task.area.impl.RectangularArea;
import by.bsuir.task.area.interfaces.Area;
import by.bsuir.task.reader.impl.ConsoleReader;
import by.bsuir.task.writer.impl.ConsoleWriter;

public class Main {

    public static void main(String[] args) {
        var writer = new ConsoleWriter();
        var reader = new ConsoleReader(writer);
        Area taskArea = new FreeArea(
                new RectangularArea(-4, 0, 8, 5),
                new RectangularArea(-6, -3, 12, 3)
        );

        writer.println("Input x:");
        var x = reader.readDouble();

        writer.println("Input y:");
        var y = reader.readDouble();

        writer.println("Task area " + (taskArea.contains(x, y) ? "contains" : "doesnt contain") + " the point");
    }
}
