package io.zipcoder.pets;

import io.zipcoder.pets.Pet;

public class PetFactory {

    public PetFactory() {
    }

    public void createPet(String petType, String petName) {
        Pet newPet;
        petType.toLowerCase();
        switch (petType) {
            case "dog":
                newPet = new Dog(petName);
                sendPetToWarehouse(newPet);
                break;
            case "cat":
                newPet = new Cat(petName);
                sendPetToWarehouse(newPet);
                break;
            case "direwolf":
                newPet = new Direwolf(petName);
                sendPetToWarehouse(newPet);
                break;
        }
    }

    public void sendPetToWarehouse(Pet pet) {
        PetWarehouse.INSTANCE.getPets().add(pet);
    }

}
