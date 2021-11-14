package by.bsuir.task.area.impl;

import by.bsuir.task.area.interfaces.Area;

public class RectangularArea implements Area {
    private final double left;
    private final double top;
    private final double right;
    private final double bottom;

    public RectangularArea(double x, double y, double width, double height) {
        left = x;
        top = y + height;
        right = x + width;
        bottom = y;
    }

    @Override
    public boolean contains(double x, double y) {
        return x >= left && y >= bottom && x <= right && y <= top;
    }
}
