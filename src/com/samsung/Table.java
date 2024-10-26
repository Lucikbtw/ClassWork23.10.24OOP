package com.samsung;

import java.util.Scanner;


public class Table {
    private int countLeg;
    private String material;
    private String color;
    private int cost;

    public Table(int countLeg, String material, String color, int cost) {
        this.countLeg = countLeg;
        this.material = material;
        this.color = color;
        this.cost = cost;
    }

    public Table(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public int getCountLeg() {
        return countLeg;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }
    public int getCost() {
        return cost;
    }

    public void setCountLeg(int countLeg) {
        this.countLeg = countLeg;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Table{" +
                "countLeg=" + countLeg +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }
}
