package by.bsuir.task.sports.equipment.impl;

import by.bsuir.task.sports.equipment.interfaces.Weightable;

import java.util.ArrayList;
import java.util.List;

public class Basket implements Weightable {
    private final List<Ball> balls;

    public Basket() {
        balls = new ArrayList<>();
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public List<Ball> getBalls() {
        return balls;
    }

    @Override
    public int getWeight() {
        int weight = 0;
        for (Weightable ball : balls) {
            weight += ball.getWeight();
        }

        return weight;
    }
}
