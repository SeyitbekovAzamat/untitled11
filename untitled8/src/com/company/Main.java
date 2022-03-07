package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 10);
        Triangle triangle = new Triangle("Triangle", 4, 4, 4);
        Rectangle rectangle = new Rectangle("Rectangle", 5, 5);
        Square square = new Square("Square", 4);


        Drawable[] drawables = {new Dog("gav"), new Cet("cat"), circle, triangle, rectangle, square};
        for (Drawable drawable : drawables) {
            if (drawable instanceof Figure) {
                System.out.println(
                        ((Figure) drawable).getName() + "периметр->" +
                                ((Figure) drawable).calculatePerimeter());

            } else if (drawable instanceof Animal) {
                System.out.println(((Animal) drawable).getName());

            }
            drawable.draw();
        }
    }
}
