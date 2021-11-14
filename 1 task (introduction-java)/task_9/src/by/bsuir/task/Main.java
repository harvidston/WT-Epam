package by.bsuir.task;

import by.bsuir.task.sports.equipment.enums.Color;
import by.bsuir.task.sports.equipment.impl.Ball;
import by.bsuir.task.sports.equipment.impl.Basket;
import by.bsuir.task.sports.equipment.utils.BasketUtils;
import by.bsuir.task.writer.impl.ConsoleWriter;

public class Main {
    public static void main(String[] args) {
        var writer = new ConsoleWriter();

        var basket = new Basket();
        basket.addBall(new Ball(Color.BLUE, 1));
        basket.addBall(new Ball(Color.BLUE, 1));
        basket.addBall(new Ball(Color.RED, 2));

        writer.println("Weight of basket is: " + basket.getWeight());
        writer.println("Amount of blue balls: " + BasketUtils.getBlueBallsCount(basket));
    }
}
