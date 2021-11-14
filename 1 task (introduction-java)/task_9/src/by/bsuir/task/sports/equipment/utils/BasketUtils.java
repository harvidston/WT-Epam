package by.bsuir.task.sports.equipment.utils;

import by.bsuir.task.sports.equipment.enums.Color;
import by.bsuir.task.sports.equipment.impl.Basket;
import by.bsuir.task.sports.equipment.interfaces.Colorable;

public class BasketUtils {
    public static int getBlueBallsCount(Basket basket) {
        int amount = 0;
        for (Colorable ball : basket.getBalls()) {
            if (ball.getColor() == Color.BLUE) amount++;
        }

        return amount;
    }
}
