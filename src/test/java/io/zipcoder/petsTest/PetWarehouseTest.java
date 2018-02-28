package io.zipcoder.petsTest;

import io.zipcoder.pets.Direwolf;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.PetWarehouse;
import org.junit.Assert;
import org.junit.Test;

public class PetWarehouseTest {

    private Dog dog;
    private Cat cat;
    private Direwolf direwolf;

    @Test
    public void PetWarehouseConstructorTest() {
        // Given
        int expectedPetArrayListSize = 0;
        // When
        int actualPetArrayListSize = PetWarehouse.INSTANCE.getNumberOfPets();
        // Then
        Assert.assertEquals(expectedPetArrayListSize, actualPetArrayListSize);
    }

    @Test
    public void getPetsTest() {
        // Given
        String expectedDogName = "dogName";
        // When
        dog = new Dog(expectedDogName);
        PetWarehouse.INSTANCE.getPets().add(dog);
        String actualDogName = PetWarehouse.INSTANCE.getPets().get(0).getName();
        // Then
        Assert.assertEquals(expectedDogName, actualDogName);
    }

    @Test
    public void getNumberOfPetsTest() {
        // Given
        int expectedSizeOfPetArrayList = 1;
        // When
        cat = new Cat("catName");
        PetWarehouse.INSTANCE.getPets().add(cat);
        int actualSizeOfPetArrayList = PetWarehouse.INSTANCE.getNumberOfPets();
        // Then
        Assert.assertEquals(expectedSizeOfPetArrayList, actualSizeOfPetArrayList);
    }

    @Test
    public void addPetsTest() {
        // Given
        String expectedNewDogName = "newDogName";
        // When
        dog = new Dog(expectedNewDogName);
        PetWarehouse.INSTANCE.addPets(dog);
        String actualNewDogName = PetWarehouse.INSTANCE.getPets().get(0).getName();
        // Then
        Assert.assertEquals(expectedNewDogName, actualNewDogName);
    }

    @Test
    public void removePetsTest() {
        // Given
        String expectedNewDirewolfName = "newDirewolfName";
        int expectedPetArrayListSize = 0;
        // When
        direwolf = new Direwolf(expectedNewDirewolfName);
        PetWarehouse.INSTANCE.addPets(direwolf);
        PetWarehouse.INSTANCE.removePets(direwolf);
        int actualPetArrayListSize = PetWarehouse.INSTANCE.getNumberOfPets();
        // Then
        Assert.assertEquals(expectedPetArrayListSize, actualPetArrayListSize);
    }

    @Test
    public void printPetNamesAndWhatTheySpeakTest() {
        // Given
        String expectedPetName = "petName";
        String expectedWhatPetSpeaks = "woof";
        Dog pet = new Dog(expectedPetName);
        // When
        PetWarehouse.INSTANCE.addPets(pet);
        String actualPetName = PetWarehouse.INSTANCE.getPets().get(0).getName();
        String actualWhatPetSpeaks = PetWarehouse.INSTANCE.getPets().get(0).speak();
        PetWarehouse.INSTANCE.printPetNamesAndWhatTheySpeak();
        // Then
        Assert.assertEquals(expectedPetName, actualPetName);
        Assert.assertEquals(expectedWhatPetSpeaks, actualWhatPetSpeaks);
    }

}
