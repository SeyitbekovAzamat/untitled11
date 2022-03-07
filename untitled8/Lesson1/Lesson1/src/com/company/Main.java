package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Shelter shelter = new Shelter("Romashka",
                "Pervomayskaya 4");

        Dog dog = new Dog("Rex","Ovcharka",
                new String[]{"Сидеть","Лежать"}, shelter, EnumColor.BLACK);
        System.out.println(dog.getInfo());
        dog.makeVoice();
    }
}
