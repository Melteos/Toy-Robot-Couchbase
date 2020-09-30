package com.trendyol.toyrobot.domain.directions;

import com.trendyol.toyrobot.domain.directions.Compass;

public abstract class Direction implements Mover {

    int x;
    int y;
    Compass compass;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Compass getCompass() {
        return compass;
    }

    public void setCompass(Compass compass) {
        this.compass = compass;
    }

}
