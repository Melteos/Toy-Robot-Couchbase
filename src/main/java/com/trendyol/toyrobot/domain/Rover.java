package com.trendyol.toyrobot.domain;

import com.trendyol.toyrobot.domain.directions.Compass;
import com.trendyol.toyrobot.domain.directions.Direction;
import com.trendyol.toyrobot.domain.directions.North;
import com.trendyol.toyrobot.domain.directions.South;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Rover {

    private String id;
    private int x;
    private int y;
    private Direction direction;
    private List<Material> material;

    public Rover() {
        this.id = UUID.randomUUID().toString();
        this.x = 0;
        this.y = 0;
        this.direction = new North();
        this.material = Arrays.asList(new Material("Ramazan"));
    }

    public Rover(int x, int y, Compass compass) {
        this.id = UUID.randomUUID().toString();
        this.x = x;
        this.y = y;
        this.direction = new North();
        this.material = Arrays.asList(new Material("Muhammed"));
    }

    public void move() {
        direction.move();
        this.material.add(new Material(this.direction.getCompass().name()));
    }

    public void turnLeft() {
        this.direction = this.direction.turnLeft();
        this.material.add(new Material(this.direction.getCompass().name()));
    }

    public void turnRight() {
        this.direction = this.direction.turnRight();
        this.material.add(new Material(this.direction.getCompass().name()));
    }

    public String getId() {
        return id;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public List<Material> getMaterial() {
        return material;
    }

    public void setMaterial(List<Material> material) {
        this.material = material;
    }
}
