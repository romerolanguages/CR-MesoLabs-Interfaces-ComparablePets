package io.zipcoder.petsTest;

import io.zipcoder.pets.*;

import org.junit.Assert;
import org.junit.Test;

public class PetFactoryTest {

    private PetWarehouse petWarehouse;
    private Dog dog;
    private Cat cat;
    private Direwolf direwolf;
    private Pet pet;
    private PetFactory petFactory;

    @Test
    public void PetFactoryDefaultConstructorTest() {
        // how do you test for a static PetFactory?
    }

    @Test
    public void createAndReturnPetTest() {
        // Given
        String expectedPetType = "dog";
        String expectedPetName = "dogName";
        // When
        Pet pet = petFactory.createAndReturnPet(expectedPetType, expectedPetName);
        petFactory.sendPetToWarehouse(pet);
        String actualPetName = petWarehouse.getPets().get(0).getName();
        // Then
        Assert.assertEquals(expectedPetName, actualPetName);

    }

    @Test
    public void sendPetToWarehouse() {
        // Given
        String expectedPetType = "dog";
        String expectedPetName = "dogName";
        dog = new Dog(expectedPetName);
        // When
        petFactory.sendPetToWarehouse(dog);
        String actualPetName = petWarehouse.getPets().get(0).getName();
        // Then
        Assert.assertEquals(expectedPetName, actualPetName);
    }


}
