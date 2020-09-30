package com.trendyol.toyrobot.domain.directions;

import com.trendyol.toyrobot.domain.directions.Compass;
import com.trendyol.toyrobot.domain.directions.Direction;
import com.trendyol.toyrobot.domain.directions.Mover;

public class North extends Direction implements Mover {

    public North() {
        this.x = 0;
        this.y = 0;
        this.compass = Compass.NORTH;
    }

    public North(Direction direction) {
        this.x = direction.x;
        this.y = direction.y;
        this.compass = Compass.NORTH;
    }

    @Override
    public void move() {
        this.y = this.y + 1;
    }

    @Override
    public Direction turnRight() {
        this.compass = Compass.EAST;
        return new East(this);
    }

    @Override
    public Direction turnLeft() {
        this.compass = Compass.WEST;
        return new West(this);
    }
}
