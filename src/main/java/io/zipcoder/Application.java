package io.zipcoder;

import io.zipcoder.pets.Pet;
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
        PetWarehouse.INSTANCE.printPetNamesAndWhatTheySpeak();

        Collections.sort(PetWarehouse.INSTANCE.getPets());

        PetWarehouse.INSTANCE.printPetNamesAndWhatTheySpeak();
    }

}
