package io.zipcoder.pets;

import java.util.ArrayList;

public enum PetWarehouse {

    INSTANCE;
//    private static final PetWarehouse INSTANCE = new PetWarehouse();
//
//    private PetWarehouse() {}
//
//    public static PetWarehouse getPetWarehouse() {
//        return INSTANCE;
//    }

    private ArrayList<Pet> pets = new ArrayList<Pet>();

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public int getNumberOfPets() {
        return pets.size();
    }

    public void addPets(Pet pet) {
        pets.add(pet);
    }

    public void removePets(Pet pet) {
        pets.remove(pet);
    }

    public void printPetNamesAndWhatTheySpeak() {
        StringBuilder sb = new StringBuilder();
        for (Pet pet : pets) {
            sb.append("> Pet name: " + pet.getName() + "\n" +
                       "\t" + "speaks: " + pet.speak());
            if (pets.size() > 1) {
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
