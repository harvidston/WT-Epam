package by.bsuir.task.area.impl;

import by.bsuir.task.area.interfaces.Area;

public class FreeArea implements Area {
    private final Area[] areas;

    public FreeArea(Area... areas) {
        this.areas = areas;
    }

    @Override
    public boolean contains(double x, double y) {
        for (Area area : areas) {
            if (area.contains(x, y)) return true;
        }

        return false;
    }
}
