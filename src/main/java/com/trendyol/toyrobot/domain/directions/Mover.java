package com.trendyol.toyrobot.domain.directions;

public interface Mover {
    void move();
    Direction turnRight();
    Direction turnLeft();
}
