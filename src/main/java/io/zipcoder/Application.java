package io.zipcoder;

import io.zipcoder.pets.Pet;
import io.zipcoder.pets.PetForm;
import io.zipcoder.pets.PetWarehouse;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        PetForm petFormTest = new PetForm();
        int numberOfPets = petFormTest.howManyPets();
        petFormTest.sendPetToFactory(numberOfPets);
        PetWarehouse.INSTANCE.printPetNamesAndWhatTheySpeak();
    }

}
