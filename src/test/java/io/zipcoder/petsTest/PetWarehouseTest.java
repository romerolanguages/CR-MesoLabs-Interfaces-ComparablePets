package io.zipcoder.petsTest;

import io.zipcoder.pets.Pet;
import io.zipcoder.pets.Direwolf;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.PetWarehouse;
import org.junit.Assert;
import org.junit.Test;

public class PetWarehouseTest {

    private PetWarehouse petWarehouse;
    private Dog dog;
    private Cat cat;
    private Direwolf direwolf;

    @Test
    public void PetWarehouseConstructorTest() {
        // Given
        int expectedPetArrayListSize = 0;
        // When
        petWarehouse = new PetWarehouse();
        int actualPetArrayListSize = petWarehouse.getPetArrayList().size();
        // Then
        Assert.assertEquals(expectedPetArrayListSize, actualPetArrayListSize);
    }

    @Test
    public void getPetArrayListTest() {
        // Given
        String expectedDogName = "dogName";
        // When
        dog = new Dog(expectedDogName);
        petWarehouse = new PetWarehouse();
        petWarehouse.getPetArrayList().add(dog);
        String actualDogName = petWarehouse.getPetArrayList().get(0).getName();
        // Then
        Assert.assertEquals(expectedDogName, actualDogName);
    }

    @Test
    public void getNumberOfPetsTest() {
        // Given
        int expectedSizeOfPetArrayList = 1;
        // When
        cat = new Cat("catName");
        petWarehouse = new PetWarehouse();
        petWarehouse.getPetArrayList().add(cat);
        int actualSizeOfPetArrayList = petWarehouse.getPetArrayList().size();
        // Then
        Assert.assertEquals(expectedSizeOfPetArrayList, actualSizeOfPetArrayList);
    }

    @Test
    public void addPetsTest() {
        // Given
        String expectedNewDogName = "newDogName";
        // When
        dog = new Dog(expectedNewDogName);
        petWarehouse = new PetWarehouse();
        petWarehouse.addPets(dog);
        String actualNewDogName = petWarehouse.getPetArrayList().get(0).getName();
        // Then
        Assert.assertEquals(expectedNewDogName, actualNewDogName);
    }

    @Test
    public void removePetsTest() {
        // Given
        int expectedNewDirewolfName = "newDirewolfName";
        int expectedPetArrayListSize = 0;
        // When
        direwolf = new Direwolf(expectedNewDirewolfName);
        petWarehouse = new PetWarehouse();
        petWarehouse.addPets(direwolf);
        petWarehouse.removePets(direwolf);
        int actualPetArrayListSize = petWarehouse.getNumberOfPets();
        // Then
        Assert.assertEquals(expectedPetArrayListSize, actualPetArrayListSize);
    }

}
