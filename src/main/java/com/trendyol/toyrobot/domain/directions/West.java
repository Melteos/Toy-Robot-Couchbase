package com.trendyol.toyrobot.domain.directions;

public class West extends Direction implements Mover {

    public West(Direction direction) {
        this.x = direction.x;
        this.y = direction.y;
        this.compass = Compass.WEST;
    }

    @Override
    public void move() {
        this.x = this.x - 1;
    }

    @Override
    public Direction turnRight() {
        this.compass = Compass.NORTH;
        return new North(this);
    }

    @Override
    public Direction turnLeft() {
        this.compass = Compass.SOUTH;
        return new South(this);
    }
}
