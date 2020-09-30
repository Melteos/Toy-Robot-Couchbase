package com.trendyol.toyrobot.domain.directions;

public class South extends Direction implements Mover {

    public South(Direction direction) {
        this.x = direction.x;
        this.y = direction.y;
        this.compass = Compass.SOUTH;
    }

    @Override
    public void move() {
        this.y = this.y - 1;
    }

    @Override
    public Direction turnRight() {
        this.compass = Compass.WEST;
        return new West(this);
    }

    @Override
    public Direction turnLeft() {
        this.compass = Compass.EAST;
        return new East(this);
    }
}
