package com.company;

public class Ball {
    public String color;
    public int radius;
    public int weight;

    public Ball(String color, int radius, int weight) {
        this.color = color;
        this.radius = radius;
        this.weight = weight;
    }
    public String toString() {
        return "Цвет мяча-" + color + "\nРадиус=" + radius + "\nВес=" + weight;
    }
}
