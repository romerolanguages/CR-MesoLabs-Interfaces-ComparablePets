package io.zipcoder.pets;

public abstract class Pet {

    protected String name;

    public void setName(String name) {
    }

    public String getName() {
        return null;
    }

    // do not have to test an abstract method
    abstract String speak();

}
