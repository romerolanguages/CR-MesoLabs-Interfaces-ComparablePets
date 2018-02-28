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
    public void createPetTest() {
        // Given
        String expectedPetType = "dog";
        String expectedPetName = "dogName";
        // When
        petFactory = new PetFactory();
        petFactory.createPet(expectedPetType, expectedPetName);
        String actualPetName = PetWarehouse.INSTANCE.getPets().get(0).getName();
        // Then
        Assert.assertEquals(expectedPetName, actualPetName);
    }

    @Test
    public void sendPetToWarehouse() {
        // Given
        String expectedPetName = "dogName";
        dog = new Dog(expectedPetName);
        // When
        petFactory = new PetFactory();
        petFactory.sendPetToWarehouse(dog);
        String actualPetName = PetWarehouse.INSTANCE.getPets().get(0).getName();
        // Then
        Assert.assertEquals(expectedPetName, actualPetName);
    }
}
