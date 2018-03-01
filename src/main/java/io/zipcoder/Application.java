package io.zipcoder;

import io.zipcoder.pets.Pet;
import io.zipcoder.pets.PetComparator;
import io.zipcoder.pets.PetForm;
import io.zipcoder.pets.PetWarehouse;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Application {

    public static void main(String[] args) {
        PetForm petFormTest = new PetForm();
        int numberOfPets = petFormTest.howManyPets();
        petFormTest.sendPetToFactory(numberOfPets);

        // Pet types and names as inputted
        PetWarehouse.INSTANCE.printPetNamesAndWhatTheySpeak();

        // Pet types sorted with Comparable (by pet name, the break tie by pet class type)
        Collections.sort(PetWarehouse.INSTANCE.getPets());
        PetWarehouse.INSTANCE.printPetNamesAndWhatTheySpeak();

        // Pet types sorted with Comparator (by pet class type, the break tie by pet name)
        Collections.sort(PetWarehouse.INSTANCE.getPets(), new PetComparator());
        PetWarehouse.INSTANCE.printPetNamesAndWhatTheySpeak();
    }

}
