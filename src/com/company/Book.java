package com.company;

public class Book {
    public String color;
    public String name;
    public int numberpages;

    public Book(String color, String name, int numberpages) {
        this.color = color;
        this.name = name;
        this.numberpages = numberpages;
    }
    public String toString() {
        return "Цвет книги-" + color + "\nНазвание книги-" + name + "\nКоличество страниц=" + numberpages;
    }
}
