package io.zipcoder.petsTest;

import io.zipcoder.pets.Pet;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.PetWarehouse;
import org.junit.Assert;
import org.junit.Test;

public class PetWarehouseTest {

    private PetWarehouse petWarehouse;

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
        String expectedDogName = "petname";
        // When
        Pet dog = new Dog(expectedDogName);
        petWarehouse = new PetWarehouse();
        String actualDogName = petWarehouse.getPetArrayList().get(0).getName();
        // Then
        Assert.assertEquals(expectedDogName, actualDogName);
    }

    @Test
    public void getNumberOfPetsTest() {
        // Given
        int expectedSizeOfPetArrayList = 2;
        petWarehouse = new PetWarehouse();
        // When
        int actualSizeOfPetArrayList = petWarehouse.getPetArrayList().size();
        // Then
        Assert.assertEquals(expectedSizeOfPetArrayList, actualSizeOfPetArrayList);


    }


}
