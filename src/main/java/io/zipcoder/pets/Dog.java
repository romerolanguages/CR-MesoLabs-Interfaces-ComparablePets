package io.zipcoder.pets;

public class Dog extends Pet {

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    public String speak() {
        String dogSpeak = "woof";
        return dogSpeak;
    }
}
