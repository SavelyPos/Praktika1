package com.company;

public class Dog {
    public String name;
    public String color;
    public int weight;

    public Dog(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }
    public String toString() {
        return "Имя собаки-" + name + "\nЦвет собаки-" + color + "\nВес собаки=" + weight;
    }
}
