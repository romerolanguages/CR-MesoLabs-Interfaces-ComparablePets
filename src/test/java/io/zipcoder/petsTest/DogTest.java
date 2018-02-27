package io.zipcoder.petsTest;

import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    private Dog dog;

    @Test
    public void DogDefaultConstructorTest() {
        // Given
        String expectedDogName = "";
        // When
        dog = new Dog();
        String actualDogName = dog.getName();
        // Assert
        Assert.assertEquals(expectedDogName, actualDogName);
    }

    @Test
    public void DogConstructorNameTest() {
        // Given
        String expectedDogName = "dogName";
        // When
        dog = new Dog(expectedDogName);
        String actualDogName = dog.getName();
        // Assert
        Assert.assertEquals(expectedDogName, actualDogName);
    }

    @Test
    public void setNameTest() {
        // Given
        String expectedDogName = "Spot";
        // When
        dog = new Dog();
        dog.setName(expectedDogName);
        String actualDogName = dog.getName();
        // Assert
        Assert.assertEquals(expectedDogName, actualDogName);
    }

    @Test
    public void getNameTest() {
        // Given
        String expectedDogName = "Jake";
        // When
        dog = new Dog(expectedDogName);
        String actualDogName = dog.getName();
        // Assert
        Assert.assertEquals(expectedDogName, actualDogName);
    }

    @Test
    public void speakTest() {
        // Given
        String expectedDogName = "Jake";
        String expectedDogSpeak = "woof";
        // When
        dog = new Dog(expectedDogName);
        String actualDogSpeak = dog.speak();
        // Then
        Assert.assertEquals(expectedDogSpeak, actualDogSpeak);
    }
}
