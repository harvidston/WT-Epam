package by.bsuir.task.calculator.impl;

import by.bsuir.task.calculator.interfaces.Calculator;

public class TaskCalculator implements Calculator {
    @Override
    public double calculate(double x) {
        return Math.tan(x);
    }
}
