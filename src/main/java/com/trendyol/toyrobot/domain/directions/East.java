package com.trendyol.toyrobot.domain.directions;

public class East extends Direction implements Mover {

    public East(Direction direction) {
        this.x = direction.x;
        this.y = direction.y;
        this.compass = Compass.EAST;
    }

    @Override
    public void move() {
        this.x = this.x + 1;
    }

    @Override
    public Direction turnRight() {
        this.compass = Compass.SOUTH;
        return new South(this);
    }

    @Override
    public Direction turnLeft() {
        this.compass = Compass.NORTH;
        return new North(this);
    }
}
