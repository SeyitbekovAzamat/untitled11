package com.company;

public class Rectangle extends Figure{
    private int a;
    private int b;

    public Rectangle(String name, int a, int b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public int calculatePerimeter() {
        return (a*2)+(b*2);
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDFE9");

    }
}
