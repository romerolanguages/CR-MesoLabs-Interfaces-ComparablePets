package io.zipcoder.pets;

import java.util.Comparator;

public class PetComparator implements Comparator<Pet> {

    public PetComparator() {
    }

    public int compare(Pet pet1, Pet pet2) {
        if ( pet1.getClass().getSimpleName().equals(pet2.getClass().getSimpleName()) ) {
            return pet1.getName().compareTo(pet2.getName());
        } else {
            return pet1.getClass().getSimpleName().compareTo(pet2.getClass().getSimpleName());
        }
    }

}
