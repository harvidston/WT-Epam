package by.bsuir.task.sports.equipment.impl;

import by.bsuir.task.sports.equipment.enums.Color;
import by.bsuir.task.sports.equipment.interfaces.Colorable;
import by.bsuir.task.sports.equipment.interfaces.Weightable;

public class Ball implements Weightable, Colorable {
    private final Color color;
    private final int weight;

    public Ball(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public Color getColor() {
        return color;
    }
}
