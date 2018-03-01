package io.zipcoder.pets;

public abstract class Pet implements Comparable<Pet> {

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

    public abstract String speak();

    public int compareTo(Pet otherPet) {
        if ( this.getName().equals(otherPet.getName()) ) {
            return this.getClass().getSimpleName().compareTo(otherPet.getClass().getSimpleName());
        } else {
            return this.getName().compareTo(otherPet.getName());
        }
    }

}
