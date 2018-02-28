package io.zipcoder.pets;

public class Cat extends Pet {

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    public String speak() {
        String catSpeak = "meow";
        return catSpeak;
    }
}
