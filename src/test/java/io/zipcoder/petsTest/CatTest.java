package io.zipcoder.petsTest;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    private Cat cat;

    @Test
    public void CatDefaultConstructorTest() {
        // Given
        String expectedCatName = "";
        // When
        cat = new Cat();
        String actualCatName = cat.getName();
        // Assert
        Assert.assertEquals(expectedCatName, actualCatName);
    }

    @Test
    public void CatConstructorNameTest() {
        // Given
        String expectedCatName = "catName";
        // When
        cat = new Cat(expectedCatName);
        String actualCatName = cat.getName();
        // Assert
        Assert.assertEquals(expectedCatName, actualCatName);
    }

    @Test
    public void setNameTest() {
        // Given
        String expectedCatName = "Garfield";
        // When
        cat = new Cat();
        cat.setName(expectedCatName);
        String actualCatName = cat.getName();
        // Assert
        Assert.assertEquals(expectedCatName, actualCatName);
    }

    @Test
    public void getNameTest() {
        // Given
        String expectedCatName = "Sylvester";
        // When
        cat = new Cat(expectedCatName);
        String actualCatName = cat.getName();
        // Assert
        Assert.assertEquals(expectedCatName, actualCatName);
    }

    @Test
    public void speakTest() {
        // Given
        String expectedCatName = "Sylvester";
        String expectedCatSpeak = "meow";
        // When
        cat = new Cat(expectedCatName);
        String actualCatSpeak = cat.speak();
        // Then
        Assert.assertEquals(expectedCatSpeak, actualCatSpeak);
    }
}
