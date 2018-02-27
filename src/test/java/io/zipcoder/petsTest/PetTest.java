package io.zipcoder.petsTest;

import io.zipcoder.pets.Pet;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Direwolf;
import io.zipcoder.pets.Dog;
import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    private Pet pet;
    private Dog dog;
    private Cat cat;
    private Direwolf direwolf;

    @Test
    public void setNameTest() {
        // Given
        String expectedDogName = "Fido";
        // When
        dog.setName(expectedDogName);
        String actualDogName = dog.getName();
        // Assert
        Assert.assertEquals(expectedDogName, actualDogName);
    }

    @Test
    public void getNameTest() {
        // Given
        String expectedCatName = "Felix";
        // When
        cat.setName(expectedCatName);
        String actualCatName = cat.getName();
        // Assert
        Assert.assertEquals(expectedCatName, actualCatName);
    }
}
