package io.zipcoder.pets;

public abstract class Pet {

    protected String name;

    public Pet() {
        this.name = "";
    }

    public Pet(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // do not have to test an abstract method
    public abstract String speak();

}
